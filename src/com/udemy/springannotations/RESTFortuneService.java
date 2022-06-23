package com.udemy.springannotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Have a RESTful day";
    }
}
