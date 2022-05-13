package springcore.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import springcore.qualifierAnnotation.music.Music;

import java.util.Random;

public class MusicPlayer {
    Music classicalMusic;
    Music rockMusic;

    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}
