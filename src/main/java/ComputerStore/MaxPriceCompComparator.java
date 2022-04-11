package ComputerStore;

import java.util.Comparator;

public class MaxPriceCompComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
