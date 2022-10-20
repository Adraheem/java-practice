package classwork.chapter3;

import java.util.Scanner;

public class AccountDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("John", 67.5);
        Account account2 = new Account("SamuelShola", 100);

//        System.out.printf("Name: %s%nBalance: %.2f%n", account1.getName(), account1.getBalance());
//        System.out.printf("Name: %s%nBalance: %.2f%n", account2.getName(), account2.getBalance());

        displayAccount(account1);
        displayAccount(account2);

//        System.out.println("Enter name: ");
        String name = input.nextLine();
        account1.setName(name);

        displayAccount(account1);
    }

    private static void displayAccount(Account account){
        System.out.printf("Name: %s%nBalance: %.2f%n", account.getName(), account.getBalance());
    }
}
