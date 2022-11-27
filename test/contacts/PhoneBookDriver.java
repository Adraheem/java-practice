package contacts;

import contacts.exceptions.ContactNotFoundException;

import java.util.Scanner;

public class PhoneBookDriver {
    private static final PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("""
                    Welcome to Phone book
                                    
                    1 - View all contacts
                    2 - Create new contact
                                    
                    0 - Quit
                    """);
            String res = input.next();

            if (res.trim().equals("0")) {
                break;
            }

            switch (res) {
                case "1" -> {
                    while (true) {
                        displayPhoneBook();
                        try {
                            System.out.println("Enter contact ID to view or -1 to go back");
                            int contactId = Integer.parseInt(input.next());

                            if (contactId == -1) {
                                break;
                            } else {
                                int editOption = -2;
                                while (editOption != -1 && editOption != 99) {

                                    Contact contact = phoneBook.getContactById(contactId);
                                    displayContact(contact);

                                    System.out.println("""
                                            <-- Edit -->
                                            1 -> Name
                                            2 -> Address
                                            3 -> Telephone
                                            4 -> Email
                                                                                    
                                            99 to delete contact
                                            -1 to Quit
                                            """);

                                    editOption = Integer.parseInt(input.next());

                                    switch (editOption) {
                                        case 1 -> {
                                            System.out.print("Enter new name: ");
                                            String newName = input.next();

                                            phoneBook.updateContactName(contactId, newName);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 2 -> {
                                            System.out.print("Enter Street name: ");
                                            String streetName = input.next();

                                            System.out.print("Enter City name: ");
                                            String city = input.next();

                                            System.out.print("Enter Country: ");
                                            String country = input.next();

                                            Address address = new Address(streetName, city, country);
                                            phoneBook.updateContactAddress(contactId, address);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 3 -> {
                                            System.out.print("Enter new phone number: ");
                                            String phoneNumber = input.next();

                                            phoneBook.updateContactTelephone(contactId, phoneNumber);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 4 -> {
                                            System.out.print("Enter the new Email: ");
                                            String email = input.next();

                                            phoneBook.updateContactEmail(contactId, email);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 99 -> {
                                            phoneBook.delete(contactId);
                                            System.out.println("\n ✅ Deleted successfully\n\n");
                                        }
                                    }
                                }
                            }
                        } catch (ContactNotFoundException e) {
                            System.out.println("\n ❌ " + e.getMessage() + " ❌ \n");
                        }
                    }
                }
                case "2" -> {
                    System.out.print("Enter name: ");
                    String newName = input.next();

                    System.out.print("Enter Street name: ");
                    String streetName = input.next();

                    System.out.print("Enter City name: ");
                    String city = input.next();

                    System.out.print("Enter Country: ");
                    String country = input.next();

                    Address address = new Address(streetName, city, country);

                    System.out.print("Enter phone number: ");
                    String phoneNumber = input.next();

                    System.out.print("Enter the Email address: ");
                    String email = input.next();

                    Contact newContact = new Contact(newName, email, phoneNumber, address);
                    phoneBook.add(newContact);

                    System.out.println("\n ✅ Added successfully!");
                }
            }
        }

    }

    public static void displayPhoneBook() {
        System.out.println("================ Phone book ================\n<-- All Contacts -->");
        if (phoneBook.getAllContact().size() == 0) {
            System.out.println("\n# No Contacts #\n");
        } else {
            for (Contact contact : phoneBook.getAllContact()) {
                displayContact(contact);
            }
        }
    }

    public static void displayContact(Contact contact) {
        System.out.println("-".repeat(40));
        System.out.printf("""
                        id: %d
                        Name: %s
                        Address: %s
                        Telephone: %s
                        Email: %s
                        """,
                contact.getId(), contact.getName(), contact.getAddress(), contact.getTelephone(),
                contact.getEmail());
        System.out.println("-".repeat(40));
    }
}
