import java.util.Scanner;

public class UnitPricing {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int quantity;
        int unitPrice;

        System.out.print("Please enter the Quantity desired: ");
        quantity = inputStream.nextInt();
        System.out.print("Please enter the Unit price: ");
        unitPrice = inputStream.nextInt();
        System.out.println("The Quantity desired is: " + quantity);
        System.out.println("The Unit Price is: $" + unitPrice);
        System.out.println("The Total Amount is: $" + (quantity * unitPrice));
    }
}
