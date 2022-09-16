package snacks;

import java.util.Scanner;

public class Nokia3310Driver {
    public static void main(String[] args) {
        Nokia3310 phone = new Nokia3310();
        Scanner scanner = new Scanner(System.in);

        int input;

        // main menu
        while(true){
            System.out.println(phone.mainMenu());
            System.out.println(phone.closeOrGoBack("close"));

            input = scanner.nextInt();

            if(input == 99){
                break;
            }

            switch (input){
                case 1:
                    do {
                        System.out.println(phone.phoneBookMenu());
                        System.out.println(phone.closeOrGoBack(""));
                        input = scanner.nextInt();

                        switch(input){
                            case 8:
                                do {
                                    System.out.println(phone.phoneBookOptionsMenu());
                                    System.out.println(phone.closeOrGoBack(""));
                                    input = scanner.nextInt();
                                } while (input != 99);
                                input = 0;
                                break;

                            default:
                                break;
                        }

                    } while (input != 99);
                    break;

                case 2:
                    do {
                        System.out.println(phone.messagesMenu());
                        System.out.println(phone.closeOrGoBack(""));
                        input = scanner.nextInt();

                    } while (input != 99);
                    break;

                case 3:
                    do {
                        System.out.println(phone.chatMenu());
                        System.out.println(phone.closeOrGoBack(""));
                        input = scanner.nextInt();

                    } while (input != 99);
                    break;

                case 4:
                    do {
                        System.out.println(phone.callRegisterMenu());
                        System.out.println(phone.closeOrGoBack(""));
                        input = scanner.nextInt();

                    } while (input != 99);
                    break;

                default:
                    break;
            }
        }
    }
}
