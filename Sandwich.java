public class Sandwich extends Product implements Preparable {
    Sandwich(String name, double price) {
        super("Cheese sandwich", 159);
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
