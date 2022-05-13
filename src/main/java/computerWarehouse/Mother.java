package computerWarehouse;

public class Mother {
    private final String name;
    private final double price;

    public Mother(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "}\n";
    }
}
