package springcore.springcore3;

import org.springframework.stereotype.Component;

//@Component
public class Battery {
    private String model;

    public Battery(String model) {
        this.model = model;
    }

//    public Battery() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
