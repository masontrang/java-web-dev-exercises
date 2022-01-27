package org.launchcode.java.demos.technology;

public class SmartPhone extends Computer {
    private int numOfApps=0;
    private int numOfPhotos=0;

    public SmartPhone(boolean isOn, boolean isConnectedToInternet, double weight, String brand, String model) {
        super(isOn, isConnectedToInternet, weight, brand, model);
        this.numOfApps = numOfApps;
        this.numOfPhotos = numOfPhotos;
    }

    public void takePhoto(){
        this.numOfPhotos = this.numOfPhotos+1;
    }

    public void downloadApp(){
        this.numOfApps = this.numOfApps+1;
    }

    public int getNumOfApps() {
        return numOfApps;
    }
    public void setNumOfApps(int numOfApps) {
        this.numOfApps = numOfApps;
    }
    public int getNumOfPhotos() {
        return numOfPhotos;
    }
    public void setNumOfPhotos(int numOfPhotos) {
        this.numOfPhotos = numOfPhotos;
    }
}
