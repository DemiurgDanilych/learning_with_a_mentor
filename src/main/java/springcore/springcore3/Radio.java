package springcore.springcore3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {

    private Battery battery;

//    @Autowired
    public Radio(Battery battery) {
        this.battery = battery;
    }

    public void getBatteryInfo() {
        System.out.println(battery.getModel());
    }
}
