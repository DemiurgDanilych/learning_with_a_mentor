package ComputerWarehouse;

public class Computer {
    private String videocard;
    private String powerBlock;
    private String mother;

    public Computer(String videocard, String powerBlock, String mother) {
        this.videocard = videocard;
        this.powerBlock = powerBlock;
        this.mother = mother;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getPowerBlock() {
        return powerBlock;
    }

    public void setPowerBlock(String powerBlock) {
        this.powerBlock = powerBlock;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "videocard='" + videocard + '\'' +
                ", powerBlock='" + powerBlock + '\'' +
                ", Mother='" + mother + '\'' +
                '}';
    }
}
