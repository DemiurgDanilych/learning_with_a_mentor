package computerWarehouse;

public class PowerBlock implements Components {
    private final String name;
    private final double price;

    public PowerBlock(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PowerBlock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "}\n";
    }
}
