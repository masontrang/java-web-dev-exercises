package org.launchcode.java.demos.technology;

public class Laptop extends Computer {
    private boolean isPortable;


    public Laptop(boolean isOn, boolean isConnectedToInternet, double weight, String brand, String model){
        super(isOn, isConnectedToInternet, weight, brand, model);
        this.isPortable = isPortable;
    }


    public boolean isPortable(){
        if(weight < 3){
            isPortable = true;
        }else{
            isPortable = false;
        }
        return isPortable;
    }





}
