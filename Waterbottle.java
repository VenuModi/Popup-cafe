public class Waterbottle extends Product {
    Waterbottle(String name, double price) {
        super("WaterScan", 159);
    }

    @Override
    public String description() {
        return "Here's your" + super.getName();
    }
}
