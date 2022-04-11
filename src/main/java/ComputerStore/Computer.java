package ComputerStore;

public class Computer  {
    private String name;
    private Motherboard motherboard;
    private PowerBloc powerBloc;
    private VideoCard videoCard;
    private double price = 0;

    public Computer(String name,Motherboard motherboard, PowerBloc powerBloc) {
    }

    public Computer(String name,Motherboard card, PowerBloc powerBloc, VideoCard videoCard) {
        this.name = name;
        this.motherboard = card;
        this.powerBloc = powerBloc;
        this.videoCard = videoCard;
        this.price = card.getPrice()+powerBloc.getPrice()+ videoCard.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PowerBloc getPowerBloc() {
        return powerBloc;
    }

    public void setPowerBloc(PowerBloc powerBloc) {
        this.powerBloc = powerBloc;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
