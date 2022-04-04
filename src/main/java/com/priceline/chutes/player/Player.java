package com.priceline.chutes.player;

import lombok.Data;

@Data
public class Player {

    private String name;
    private int position;

    public Player(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name should not be blank or empty");
        }
        this.name = name;
        this.position = 0;
    }

    public String toString() {
        return this.getName() + ", position: " + this.getPosition();
    }
}
