package computerWarehouse;

public class VideoCard {
    private final String name;
    private final double price;

    public VideoCard(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "}\n";
    }
}
