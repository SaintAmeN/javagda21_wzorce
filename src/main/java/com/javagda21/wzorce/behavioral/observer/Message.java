package com.javagda21.wzorce.behavioral.observer;

import lombok.Data;

@Data
public class Message {
    private int level;
    private String message;

    public Message(int level, String message) {
        this.level = level;
        this.message = message;
    }
}
