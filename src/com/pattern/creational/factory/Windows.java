package com.pattern.creational.factory;

public class Windows implements OperatingSystem{
    @Override
    public void config() {
        System.out.println("Configuring Windows System .....");
    }
}
