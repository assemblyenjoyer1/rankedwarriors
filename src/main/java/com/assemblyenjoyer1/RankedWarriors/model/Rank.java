package com.assemblyenjoyer1.RankedWarriors.model;

public enum Rank {

    IRON("Iron"),
    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("Gold"),
    PLATINUM("Platinum"),
    EMERALD("Emerald"),
    DIAMOND("Diamond"),
    MASTER("Master"),
    GRANDMASTER("Grandmaster"),
    CHALLENGER("Challenger");

    private final String name;

    Rank(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
