package com.example;

import java.util.List;

public interface Kittens {
    int getKittens();
    List<String> getFood(String animalKind) throws Exception;
}