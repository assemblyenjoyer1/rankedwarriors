package com.assemblyenjoyer1.RankedWarriors.model;

public enum Role {

    TOPLANE("Toplane"),
    JUNGLE("Jungle"),
    MIDLANE("Midlane"),
    BOTLANE("Botlane"),
    SUPPORT("Support");

    private final String name;

    Role(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}

