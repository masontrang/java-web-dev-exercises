package org.launchcode.java.demos.technology;

public class Computer extends AbstractEntity{

    private boolean isOn = false;
    private boolean isConnectedToInternet = false;
    public double weight;
    private String brand = "";
    private String model = "";

    public Computer(boolean isOn, boolean isConnectedToInternet, double weight, String brand, String model) {
        this.isOn = isOn;
        this.isConnectedToInternet = isConnectedToInternet;
        this.weight = weight;
        this.brand = brand;
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isConnectedToInternet() {
        return isConnectedToInternet;
    }

    public void setConnectedToInternet(boolean connectedToInternet) {
        isConnectedToInternet = connectedToInternet;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void powerOn(){
        isOn = true;
        isConnectedToInternet = false;
    }

    public void powerOff(){
        isOn = false;
        isConnectedToInternet = false;
    }

    public void connectToInternet(){
        isOn = true;
        isConnectedToInternet = true;
    }


}


