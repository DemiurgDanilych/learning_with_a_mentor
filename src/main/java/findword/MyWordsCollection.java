package findword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyWordsCollection  {
    private List<String> myCollection = new ArrayList<>();

    public List<String> getMyCollection() {
        return myCollection;
    }

    public void fillCollectionTestWords() {
        myCollection.add("Вася");
        myCollection.add("Петя");
        myCollection.add("Данил");
        myCollection.add("Сергей");
        Collections.sort(myCollection);

    }

    public void add(String aWord) {
        myCollection.add(aWord);
    }

    public void del(String dWord) {
        myCollection.remove(dWord);
    }

    public void printCollectionInConsole() {
        myCollection.forEach(System.out::println);
        System.out.println("\n");
    }
}
