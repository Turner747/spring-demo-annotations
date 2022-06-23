package com.udemy.springannotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    // array of strings
    private String[] data = {
            "beware of the wolf in sheep's clothing",
            "Dilligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }

}
