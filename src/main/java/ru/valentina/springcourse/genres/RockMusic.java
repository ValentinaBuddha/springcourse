package ru.valentina.springcourse.genres;

import org.springframework.stereotype.Component;
import ru.valentina.springcourse.Music;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
