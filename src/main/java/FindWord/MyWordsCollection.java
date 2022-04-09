package FindWord;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyWordsCollection  {
    private List<String> myCollection = new ArrayList<>();


    public List<String> getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(List<String> myCollection) {
        this.myCollection = myCollection;
    }

    public void fillCollectionTestWords() {
        this.myCollection.add("Вася");
        this.myCollection.add("Петя");
        this.myCollection.add("Данил");
        this.myCollection.add("Сергей");
        Collections.sort(this.myCollection);

    }

    public void add(String aWord) {
        this.myCollection.add(aWord);
    }

    public void del(String dWord) {
        if(this.myCollection.contains(dWord)) {
            this.myCollection.remove(dWord);
        }
    }

    public void printCollectionInConsole() {
        this.myCollection.forEach(System.out::println);
        System.out.println("\n");
    }
}
