package com.assemblyenjoyer1.RankedWarriors.util;

import com.google.gson.Gson;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        Gson gson = new Gson();
        String jsonString = gson.toJson(date, Date.class);
        System.out.println(jsonString);
    }
}
