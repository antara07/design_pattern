package com.pattern.creational.factory;

public class Linux implements OperatingSystem{
    @Override
    public void config() {
        System.out.println("Configuring Linux System.....");
    }
}
