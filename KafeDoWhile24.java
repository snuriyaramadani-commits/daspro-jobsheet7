import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffe;
        int tea;
        int bread;
        int totalPrice;
        int coffePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;
        String customerName;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }

            System.out.println("Number of coffees: ");
            coffe = sc.nextInt();
            System.out.println("Mumber of teas: ");
            tea = sc.nextInt();
            System.out.println("Number of breads: ");
            bread = sc.nextInt();

            totalPrice = (coffe * coffePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total to be paid: Rp" + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All transaction completed.");
        sc.close();
    }
}
