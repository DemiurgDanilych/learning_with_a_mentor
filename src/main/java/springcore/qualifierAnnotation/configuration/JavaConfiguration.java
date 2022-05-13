package springcore.qualifierAnnotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springcore.qualifierAnnotation.MusicPlayer;
import springcore.qualifierAnnotation.music.ClassicalMusic;
import springcore.qualifierAnnotation.music.Music;
import springcore.qualifierAnnotation.music.RockMusic;

@Configuration
public class JavaConfiguration {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(Music classicalMusic, Music rockMusic){
        return new MusicPlayer(classicalMusic,rockMusic);
    }
}
