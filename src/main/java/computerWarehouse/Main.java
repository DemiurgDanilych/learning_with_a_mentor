package computerWarehouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Computer> computers = new ArrayList<>();

    public static void main(String[] args) {
        putComputer(computers);

        for (Computer comp : computers) {
            System.out.println(comp.toString());
        }

        System.out.println("The most expensive computer: \n" + expensiveComputer(computers).toString());

        System.out.println("The price of all computers: \n" + priceAllComputer(computers));
    }




    private static void putComputer(List<Computer> list) {

        list.add(new Computer(new VideoCard("Videocard 1", 99.5)
                , new PowerBlock("PowerBlock 1", 55.88)
                , new Mother("Mother 1", 55.9)));

        list.add(new Computer(new VideoCard("Videocard 2", 87)
                , new PowerBlock("PowerBlock 2", 11.25)
                , new Mother("Mother 2", 84.9)));

        list.add(new Computer(new VideoCard("Videocard 3", 54.7)
                , new PowerBlock("PowerBlock 3", 99.5)
                , new Mother("Mother 3", 45.25)));
    }


    private static Computer expensiveComputer(List<Computer> computerList) {
        Computer maxComp = new Computer();
        for (Computer comp : computerList) {
            if (maxComp.getPrice() < comp.getPrice()) {
                maxComp = comp;
            }
        }
        return maxComp;
    }

    private static double priceAllComputer(List<Computer> computers1) {
        return computers1.stream().map(Computer::getPrice).reduce(0.0, Double::sum);
    }
}
