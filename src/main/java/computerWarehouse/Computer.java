 package computerWarehouse;

public class Computer {
    private Components videoCard;
    private Components powerBlock;
    private Components mother;
    private double price;


    public Computer(){}

    public Computer(Components videoCard, Components powerBlock, Components mother) {
        this.videoCard = videoCard;
        this.powerBlock = powerBlock;
        this.mother = mother;
        IEvaluator evaluatorComputer = new EvaluatorComputer();
        this.price = evaluatorComputer.sum(videoCard,powerBlock,mother);
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
