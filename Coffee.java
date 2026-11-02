public class Coffee extends Product implements Preparable {

    Coffee(String name, double price) {
        super("Cappucino", 55);
    }

    @Override
    public String description() {
        return "Here's your" + super.getName();
    }

    @Override
    public void preparable() {
        System.out.println("Preparaing.... " + super.getName());
    }
}
