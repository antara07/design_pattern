package com.pattern.creational.factory;

public class OperatingSystemFactory {

    public OperatingSystem getOS(final String osType){
        if(osType.equals("Windows")){
            return new Windows();
        } else if (osType.equals("Linux")) {
            return new Linux();
        }
        return null;
    }
}
