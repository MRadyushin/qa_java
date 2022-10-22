package com.example;

import java.util.List;

public class Lion implements Kittens {

    Feline kittens;
    boolean hasMane;

    public Lion(String sex, Feline kittens) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.kittens = kittens;
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return kittens.getFood("Хищник");
    }
}
