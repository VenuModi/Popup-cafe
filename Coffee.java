public class Coffee extends Product {

    Coffee(String name, double price) {
        super("Cappucino", 55);
    }

    public String description() {
        return "Here's your" + super.getName();

    }
}
