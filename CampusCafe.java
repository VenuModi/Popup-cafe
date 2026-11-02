
import java.util.Scanner;

public class CampusCafe {

    public static void main(String[] args) {

        String cafeName = "CAMPUS CAFE";

        int nextOrderNumber = 1;// Orders starts with 1 not negative.
        boolean isCafeOpen = true; // Cafe open is set to true

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====WELCOME TO  " + cafeName + "!=====");

        while (isCafeOpen) {

            showMenu();

            System.out.println("Choose an option: ");

            int menuChoice = scanner.nextInt();

            switch (menuChoice) {

                case 1:
                    System.out.println("Prodcuts are shown here.");
                    break;
                case 2:
                    System.out.println("Place an order!");
                    break;
                case 3:
                    System.out.println("3. Show all orders");
                    break;
                case 4:
                    System.out.println("4. View order queue");
                    break;
                case 5:
                    System.out.println("5. Prepare next order");
                    break;
                case 6:
                    System.out.println("6. Hand-out finished orders");
                    break;
                case 7:
                    System.out.println("7. View today's stats");
                    break;
                case 8:
                    isCafeOpen = false;
                    System.out.println("Thank you for visting our cafe");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        }

        scanner.close();
    }

    public static void showMenu() {

        System.out.println("\n1. Show products & price");
        System.out.println("2. Place an orde");
        System.out.println("3. Show all orders");
        System.out.println("4. View order queue");
        System.out.println("5. Prepare next order");
        System.out.println("6. Hand-out finished orders");
        System.out.println("7. View today's stats");
        System.out.println("8. Exit");
    }
}
