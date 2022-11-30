package diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Diary diary;
    private static final Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        String mainMain = """
                Welcome to my Diary!
                Let's setup it up
                """;
        print(mainMain);
        String username = input("Enter your name");

        String password = input("Enter your password");
        diary = new Diary(username, password);
        print("Diary created for " + username);
        displayLockMenu();

    }

    private static void displayLockMenu() {
        String mainMain = """
                Press
                1 -> Unlock Diary
                2 -> Lock Diary
                3 -> exit
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)) {
            case 1 -> unlockDiary();
            case 2 -> lockDiary(); // todo
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Diary locked successfully");
        displayLockMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press
                1 -> Create Entry
                2 -> Find entry by ID
                3 -> Get total number of entries
                4 -> Lock diary
                """;
        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)) {
            case 1 -> createEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> lockDiary();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntries = diary.numberOfEntries();
        print("You have " + totalNumberOfEntries + " entries");
        displayDiaryMenu();
    }

    private static void findById() {
        String id = input("Enter the ID for the entry you want to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title, body);
        print("Written successfully");
        displayDiaryMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if (diary.isLocked()) {
            print("Wrong password");
            displayLockMenu();
        } else {
            displayDiaryMenu();
        }
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
//        print(prompt);
//        return keyboardInput.nextLine();
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
//        System.out.println(prompt);
    }
}
