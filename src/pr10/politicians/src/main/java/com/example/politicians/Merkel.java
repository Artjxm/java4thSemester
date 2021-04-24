package com.example.politicians;

import org.springframework.stereotype.Component;

@Component
public class Merkel implements Politicians {

    public String doPolitics() {
        return "Merkel";
    }


}
