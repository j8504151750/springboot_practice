package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{



    @Override
    public void print(String messge) {
        System.out.println("HP印表機: " + messge);

    }
}
