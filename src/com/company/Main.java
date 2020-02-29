package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Apple").print();
        createObject("Google").print();
        createObject("Samsung").print();
    }
    public static Printable createObject(String className){
        Printable print = null;
        switch (className){
            case "Apple":
                print=new Apple("Apple", "IOS", "Version 12");
                break;
            case "Google":
                print=new Google("Google", "Android", "Version 10");
                break;
            case "Samsung":
                print=new Samsung("Samsung", "Android", "Version 2.0");
        }
        return print;
    }
}
