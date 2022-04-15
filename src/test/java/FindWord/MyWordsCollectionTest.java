package FindWord;

import FindWord.MyWordsCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class MyWordsCollectionTest {
    public static MyWordsCollection originalCollection = new MyWordsCollection();

    @BeforeEach
    void createTestCollection() {
        if (!originalCollection.getMyCollection().isEmpty()) {
            originalCollection.getMyCollection().clear();
        }
        originalCollection.add("Вася");
        originalCollection.add("Петя");
        originalCollection.add("Данил");
        originalCollection.add("Сергей");
    }

    @Test
    void fillCollectionTest() {
        MyWordsCollection resultCollection = new MyWordsCollection();
        resultCollection.fillCollectionTestWords();

        Assertions.assertEquals(originalCollection.getMyCollection(), resultCollection.getMyCollection());
    }

    @Test
    void addWordTest() {
        originalCollection.add("Darya");
        boolean expected = originalCollection.getMyCollection().contains("Darya");
        Assertions.assertTrue(expected);

    }   @Test
    void delWordTest() {
        originalCollection.del("Вася");
        boolean expected = originalCollection.getMyCollection().contains("Vasia");
        Assertions.assertFalse(expected);

    }

}