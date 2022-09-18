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
            input = scanner.nextInt();

            if(input == 99){
                System.out.println("See you another time, BYE! \uD83D\uDC4B");
                break;
            }

            switch (input){
                case 1:
                    do {
                        System.out.println(phone.phoneBookMenu());
                        input = scanner.nextInt();

                        switch(input){
                            case 8:
                                do {
                                    System.out.println(phone.phoneBookOptionsMenu());
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
                        input = scanner.nextInt();

                        switch(input){
                            case 7:
                                do {
                                    System.out.println(phone.messageSettingsMenu());
                                    input = scanner.nextInt();

                                    switch (input){
                                        case 1:
                                            do {
                                                System.out.println(phone.messageSettingsSetMenu());
                                                input = scanner.nextInt();
                                            } while(input != 99);
                                            input = 0;
                                            break;

                                        case 2:
                                            do {
                                                System.out.println(phone.messageSettingsCommonMenu());
                                                input = scanner.nextInt();
                                            } while (input != 99);
                                            input = 0;
                                            break;

                                        default:
                                            break;
                                    }
                                } while(input != 99);
                                input = 0;
                                break;

                            default:
                                break;
                        }

                    } while (input != 99);
                    break;

                case 3:
                    do {
                        System.out.println(phone.chatMenu());
                        input = scanner.nextInt();

                    } while (input != 99);
                    break;

                case 4:
                    do {
                        System.out.println(phone.callRegisterMenu());
                        input = scanner.nextInt();

                        switch(input){
                            case 5:
                                do {
                                    System.out.println(phone.callRegisterDuration());
                                    input = scanner.nextInt();
                                } while(input != 99);
                                input = 0;
                                break;

                            case 6:
                                do {
                                    System.out.println(phone.callRegisterCostsMenu());
                                    input = scanner.nextInt();
                                } while(input != 99);
                                input = 0;
                                break;

                            case 7:
                                do {
                                    System.out.println(phone.callRegisterCostSettings());
                                    input = scanner.nextInt();
                                } while(input != 99);
                                input = 0;
                                break;

                            default:
                                break;
                        }

                    } while (input != 99);
                    break;

                default:
                    break;
            }
        }
    }
}
