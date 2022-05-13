 package computerWarehouse;

 public class Computer {
    private VideoCard videoCard;
    private PowerBlock powerBlock;
    private Mother mother;
    private double price;


    public Computer(){}

    public Computer(VideoCard videoCard, PowerBlock powerBlock, Mother mother) {
        this.videoCard = videoCard;
        this.powerBlock = powerBlock;
        this.mother = mother;
        this.price = videoCard.getPrice()+powerBlock.getPrice()+ mother.getPrice();
    }


    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "videocard=" + videoCard +
                ", powerblock=" + powerBlock +
                ", mother=" + mother +
                ", price=" + price +
                "}\n";
    }
}
