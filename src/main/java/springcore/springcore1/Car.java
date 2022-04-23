package springcore.springcore1;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
        System.out.println("In Car Constructor");
    }
}
