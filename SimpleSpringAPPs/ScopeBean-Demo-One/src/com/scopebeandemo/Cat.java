package com.scopebeandemo;

public class Cat implements Animal{

    @Override
    public String makeSound() {
        return "Meow Mewo";
    }

    public void initStartup() {
        System.out.println("Cat: inside initStartup");
    }

    public void cleanup() {
        System.out.println("Cat: inside cleanup");
    }
}