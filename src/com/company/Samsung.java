package com.company;

public class Samsung extends Smartphone implements Printable{
    private String oneUI;

    public Samsung(String company, String operatingSystem, String oneUI){
        super(company, operatingSystem);
        this.oneUI=oneUI;
    }

    public String getOneUI() {
        return oneUI;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("oneUI" + oneUI);
    }
}
