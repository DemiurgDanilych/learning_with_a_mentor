package ComputerStore;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<Computer> warehouse = new ArrayList<>();

    public void add(Computer comp) {
        this.warehouse.add(comp);
    }

    public void del(Computer comp){
        this.warehouse.remove(comp);
    }



    public Computer findMaxCompPrice(){
        MaxPriceCompComparator priceComparator = new MaxPriceCompComparator();
        warehouse.sort(priceComparator);
        return warehouse.get(0);
    }

    public double totalPrice(){
        double totPrice =0;
        for (Computer comp:warehouse){
            totPrice += comp.getPrice();
        }
        return totPrice;
    }
}
