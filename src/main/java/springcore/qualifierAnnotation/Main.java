package springcore.qualifierAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springcore.qualifierAnnotation.configuration.JavaConfiguration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                JavaConfiguration.class
        );

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
    }
}
