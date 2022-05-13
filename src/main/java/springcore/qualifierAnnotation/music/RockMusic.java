package springcore.qualifierAnnotation.music;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    List<String> songs = Arrays.asList("Lithium", "River", "Come As You Are");

    @Override
    public List<String> getSong() {
        return songs;
    }
}