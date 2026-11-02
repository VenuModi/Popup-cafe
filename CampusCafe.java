public class CampusCafe {

    public static void main(String[] args) {

        String cafeName = "CAMPUS CAFE";

        System.out.println("=====WELCOME TO  " + cafeName + "!=====");

        showMenu();
        
    }

    public static void showMenu(){

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
