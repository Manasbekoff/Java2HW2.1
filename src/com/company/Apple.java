package com.company;

public class Apple extends Smartphone implements Printable {
    private String ios;

    public Apple(String company, String operatingSystem, String ios){
        super(company, operatingSystem);
        this.ios=ios;
    }

    public String getIos() {
        return ios;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("IOS" + getIos());
    }
}
