package com.udemy.springannotations;

public class MadFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "You are worthless";
    }
}
