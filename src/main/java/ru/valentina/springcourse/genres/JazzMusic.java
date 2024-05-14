package ru.valentina.springcourse.genres;

import ru.valentina.springcourse.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}