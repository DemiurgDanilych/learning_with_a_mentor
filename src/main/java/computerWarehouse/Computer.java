package computerWarehouse;

public class Computer {
    private Components videocard;
    private Components powerblock;
    private Components mother;
    private double price;


    public Computer(){}

    public Computer(VideoCard videocard, PowerBlock powerBlock, Mother mother) {
        this.videocard = videocard;
        this.powerblock = powerBlock;
        this.mother = mother;
        IEvaluator evaluatorComputer = new EvaluatorComputer();
        this.price = evaluatorComputer.sum(videocard,powerblock,mother);
    }


    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "videocard=" + videocard +
                ", powerblock=" + powerblock +
                ", mother=" + mother +
                ", price=" + price +
                "}\n";
    }
}
