package com.company;

public class Google extends Smartphone implements Printable {
    private String android;

    public Google(String company, String operatingSystem, String android){
        super(company, operatingSystem);
        this.android=android;
    }

    public String getAndroid() {
        return android;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("android" + getAndroid());
    }
}
