package com.assemblyenjoyer1.RankedWarriors.model;

import jakarta.persistence.Entity;

import java.io.Serializable;

public enum Season implements Serializable {

    SEASON14("Season14_0"),
    SEASON14_5("Season14_5"),
    SEASON15("Season15_0"),
    SEASON15_5("Season15_5");

    private final String name;

    Season(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
