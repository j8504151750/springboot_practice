package com.example.demo;

import org.springframework.stereotype.Component;

public class HpPrinter implements Printer{

    @Override
    public void print(String messge) {
        System.out.println("HP Printer :" + messge);
    }
}
