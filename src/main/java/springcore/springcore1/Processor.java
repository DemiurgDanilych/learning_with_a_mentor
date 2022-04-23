package springcore.springcore1;

public class Processor {
    private String name;

    public Processor(String name) {
        System.out.println("In Processor constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
