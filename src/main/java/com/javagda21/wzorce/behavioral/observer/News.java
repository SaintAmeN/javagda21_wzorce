package com.javagda21.wzorce.behavioral.observer;

import lombok.Data;

@Data
public class News {
    private int level;
    private String message;

    public News(int level, String message) {
        this.level = level;
        this.message = message;
    }
}
