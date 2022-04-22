package computerWarehouse;

public class VideoCard implements Components {
    private final String name;
    private final double price;

    public VideoCard(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
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
