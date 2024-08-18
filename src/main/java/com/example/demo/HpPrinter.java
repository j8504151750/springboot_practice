package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

    @Value("${printer.name}")
    private String name;

    @Value("${printer.count:20}")
    private int count ;



    @Override
    public void print(String messge) {
        count -- ;
        System.out.println(name + ": " + messge);
        System.out.println("剩餘使用次數" + count);
    }
}
