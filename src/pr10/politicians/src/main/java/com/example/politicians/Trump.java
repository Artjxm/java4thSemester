package com.example.politicians;

import org.springframework.stereotype.Component;

@Component
public class Trump implements Politicians {

    public String doPolitics() {
        return "Trump";
    }


}
