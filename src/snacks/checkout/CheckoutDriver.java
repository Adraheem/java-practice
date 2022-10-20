package snacks.checkout;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Integer> unitPrices = new ArrayList<>();

        while (true) {
            System.out.print("Enter customer name: ");
            String customerName = input.nextLine();

            System.out.print("What did the customer buy? ");
            String item = input.nextLine();

            System.out.printf("How many %s did %s buy? ", item, customerName);
            int quantity = input.nextInt();

            System.out.printf("How much is one unit of %s? ", item);
            int unitPrice = input.nextInt();

            customerNames.add(customerName);
            items.add(item);
            quantities.add(quantity);
            unitPrices.add(unitPrice);

            input.nextLine();

            System.out.println("Do you want to add another record? (yes / no)");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("no")){
                break;
            }
        }

        Checkout checkout = new Checkout(items, quantities, unitPrices, customerNames);

        System.out.println(checkout.generateReceipts());
    }
}
