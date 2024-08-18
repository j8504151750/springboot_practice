package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class CannonPrinter implements Printer{

    @Override
    public void print(String messge) {
        System.out.println("Cannon印表機: " + messge);
    }
}
