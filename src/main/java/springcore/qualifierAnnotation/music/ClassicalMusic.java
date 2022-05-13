package springcore.qualifierAnnotation.music;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = Arrays.asList("Kiss the Rain", "Melodies", "Ave Maria");

    @Override
    public List<String> getSong() {
        return songs;
    }
}


//        System.out.println(music.get((int) (Math.random() * (music.size() + 1))));
