package ComputerWarehouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Computer> computers = new ArrayList<>();

    public static void main(String[] args) {
      putComputer(computers);

        for (Computer comp: computers) {
            System.out.println(comp.toString());
        }
    }


    private static void putComputer(List<Computer> list) {
        list.add(new Computer("видеокарта 1","Энергоблок 1", "Материнка 1"));
        list.add(new Computer("видеокарта 2","Энергоблок 2", "Материнка 2"));
        list.add(new Computer("видеокарта 3","Энергоблок 3", "Материнка 3"));
    }
}
