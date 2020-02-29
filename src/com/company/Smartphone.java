package com.company;

public class Smartphone implements Printable {
    private String company;
    private String operatingSystem;

    public Smartphone(String company, String operatingSystem){
    this.company=company;
    this.operatingSystem=operatingSystem;
    }

    public String getCompany() {
        return company;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public void print() {
        System.out.println("Company" + getCompany() + " " + "OperatingSystem" + getOperatingSystem());

    }
}
