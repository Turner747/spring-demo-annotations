package com.udemy.springannotations;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService{

    private Scanner in;

    {
        try {
            in = new Scanner(new FileReader("src/fortunes.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private ArrayList<String> fortunes = new ArrayList<>();

    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        int index = 0;

        while(in.hasNext()){

            fortunes.add(in.nextLine());

            ++index;
        }

        int random = myRandom.nextInt(fortunes.size());

        String theFortune = fortunes.get(random);

        return theFortune;
    }
}
