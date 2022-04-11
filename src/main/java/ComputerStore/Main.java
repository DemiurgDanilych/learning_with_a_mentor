package ComputerStore;

public class Main {

    public static void main(String[] args) {
        WareHouse myWareHouse = new WareHouse();
        myWareHouse.add(
                new Computer("Computer 1",new Motherboard("mother 1", 3.15)
                        ,new PowerBloc("powerBlock 1",4.58)
                        ,new VideoCard("videoCard 1", 8.887)));
        myWareHouse.add(
                new Computer("Computer 2",new Motherboard("mother 2", 8.15)
                        ,new PowerBloc("powerBlock 2",1.885)
                        ,new VideoCard("videoCard 2", 3.887)));
        myWareHouse.add(
                new Computer("Computer 3",new Motherboard("mother 3", 9.15)
                        ,new PowerBloc("powerBlock 3",20.885)
                        ,new VideoCard("videoCard 3", 0.887)));


        System.out.printf("\n Суммарная стоимость всех компьютеров %.2f",myWareHouse.totalPrice());
        System.out.printf("\n Самый дорогой компьютер: %s",myWareHouse.findMaxCompPrice().getName());
    }
}
