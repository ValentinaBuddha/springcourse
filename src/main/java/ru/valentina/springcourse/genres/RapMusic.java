package ru.valentina.springcourse.genres;

import ru.valentina.springcourse.Music;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "В ритме самба";
    }
}
