package snacks.checkout;

import java.util.ArrayList;

public class Checkout {
    private final ArrayList<String> items;
    private final ArrayList<Integer> quantity;
    private final ArrayList<Integer> pricePerUnit;
    private final ArrayList<String> customerName;

    public Checkout (ArrayList<String> items, ArrayList<Integer> quantity, ArrayList<Integer> pricePerUnit,
                     ArrayList<String> customerName){
        this.items = items;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.customerName = customerName;
    }

    private int getTotal() {
        int total = 0;
        for (int i = 0; i < quantity.size(); i++) {
            int q = quantity.get(i);
            int p = pricePerUnit.get(i);

            total += q * p;
        }

        return total;
    }

    public String generateReceipts(){
        String banner = String.format("""
                %s
                %-46s%s
                %-46s%s
                %-15s%s%16s
                %-46s%s
                %-46s%s
                %s%n
                """,
                "||".repeat(24),
                "||", "||",
                "||", "||",
                "||", "Mama Nkechi Store", "||",
                "||", "||",
                "||", "||",
                "||".repeat(24)
        );

        String header = String.format("""
                %-20s%-20s%-20s%-20s%-20s
                """, "Name", "Item", "Quantity", "Price", "Subtotal");

        StringBuilder body = new StringBuilder();

        for (int i = 0; i < quantity.size(); i++) {
            body.append(String.format("""
                            %-20s%-20s%,-20d%,-20d%,-20d
                            """, customerName.get(i), items.get(i), quantity.get(i), pricePerUnit.get(i),
                    (pricePerUnit.get(i) * quantity.get(i))));
        }

        body.append(String.format("%nTOTAL: %,d%n", getTotal()));

        return banner + header + body;
    }
}
