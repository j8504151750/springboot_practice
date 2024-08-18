package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

    private int count ;

    @PostConstruct
    public void init() {
        count = 5;
    }

    @Override
    public void print(String messge) {
        count -- ;
        System.out.println("HP Printer :" + messge);
        System.out.println("剩餘使用次數" + count);
    }
}
