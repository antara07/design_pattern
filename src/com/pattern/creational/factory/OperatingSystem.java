package com.pattern.creational.factory;

public interface OperatingSystem {

    default void boot(){
        System.out.println("Booting the OS....");
    }

    void config();
}
