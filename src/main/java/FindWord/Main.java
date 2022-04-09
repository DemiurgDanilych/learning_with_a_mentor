package FindWord;

public class Main {
    public static void main(String[] args) {

        MyWordsCollection testCollection = new MyWordsCollection();

        testCollection.fillCollectionTestWords();
        testCollection.printCollectionInConsole();

        testCollection.add("Дарья");
        testCollection.del( "Данил");

        testCollection.printCollectionInConsole();

    }
}