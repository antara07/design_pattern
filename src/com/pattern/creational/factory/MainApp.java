package com.pattern.creational.factory;

public class MainApp {
    public static void main(String []args){
        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        OperatingSystem os = osFactory.getOS("Linux");
        os.config();
        os.boot();
    }
}
