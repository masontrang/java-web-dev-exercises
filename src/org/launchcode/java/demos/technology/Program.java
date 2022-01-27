package org.launchcode.java.demos.technology;

public class Program {
    public static void main(String[] args){

        Computer desktop = new Computer (false, false, 25, "Dell", "XPS");


        System.out.println("The computer is powered on: " + desktop.isOn());
        System.out.println("The computer is connected to internet: " + desktop.isConnectedToInternet());
        System.out.println("The computer weighs: " + desktop.getWeight());
        System.out.println("The computer's brand is: " + desktop.getBrand());
        System.out.println("The computer's model is: " + desktop.getModel());
        System.out.println("The computer's ID is: " + desktop.getId());
        System.out.println("***********");

        desktop.powerOn();
        desktop.connectToInternet();

        System.out.println("The computer is powered on: " + desktop.isOn());
        System.out.println("The computer is connected to internet: " + desktop.isConnectedToInternet());
        System.out.println("The computer is weighs: " + desktop.getWeight());
        System.out.println("The computer's brand is: " + desktop.getBrand());
        System.out.println("The computer's model is: " + desktop.getModel());
        System.out.println("The computer's ID is: " + desktop.getId());
        System.out.println("***********");


        Laptop laptop1 = new Laptop(false, false, 2.5, "Apple", "MacBook") ;

        System.out.println("The computer is powered on: " + laptop1.isOn());
        System.out.println("The computer is connected to internet: " + laptop1.isConnectedToInternet());
        System.out.println("The computer is weighs: " + laptop1.getWeight());
        System.out.println("The computer is portable: " + laptop1.isPortable());
        System.out.println("The computer's brand is: " + laptop1.getBrand());
        System.out.println("The computer's model is: " + laptop1.getModel());
        System.out.println("The computer's ID is: " + laptop1.getId());
        System.out.println("***********");

        laptop1.powerOn();
        laptop1.connectToInternet();

        System.out.println("The computer is powered on: " + laptop1.isOn());
        System.out.println("The computer is connected to internet: " + laptop1.isConnectedToInternet());
        System.out.println("The computer is weighs: " + laptop1.getWeight());
        System.out.println("The computer is portable: " + laptop1.isPortable());
        System.out.println("The computer's brand is: " + laptop1.getBrand());
        System.out.println("The computer's model is: " + laptop1.getModel());
        System.out.println("The computer's ID is: " + laptop1.getId());
        System.out.println("***********");

        SmartPhone iphone = new SmartPhone(false, false, 1, "Apple", "iPhone");
        System.out.println("Number of photos on device is: " + iphone.getNumOfPhotos());
        System.out.println("Number of apps on device is: " + iphone.getNumOfApps());
        iphone.takePhoto();
        iphone.downloadApp();
        System.out.println("Number of photos on device is: " + iphone.getNumOfPhotos());
        System.out.println("Number of apps on device is: " + iphone.getNumOfApps());
        System.out.println("The computer's ID is: " + iphone.getId());
    }
}
