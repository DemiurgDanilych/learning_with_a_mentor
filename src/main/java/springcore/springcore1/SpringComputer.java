package springcore.springcore1;

public class SpringComputer {
    private String model;
    private Processor processor;

    public SpringComputer(String model, Processor processor) {
        this.model = model;
        this.processor = processor;
        System.out.println("In Computer constructor");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
