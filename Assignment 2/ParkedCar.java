//Ocean Lu
//CS141
//Assignment 2
//10.23.17

public class ParkedCar {

    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String mk, String mod, String col, String lic, int 
min) {
        make = mk;
        model = mod;
        color = col;
        licenseNumber = lic;
        minutesParked = min;
    }

    public ParkedCar(ParkedCar car2) {
        make = car2.getMake();
        model = car2.getModel();
        color = car2.getColor();
        licenseNumber = car2.getLicenseNumber();
        minutesParked = car2.getMinutesParked();
    }

    public void setMake(String mk) {
        make = mk;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public void setColor(String col) {
        color = col;
    }

    public void setLicenseNumber(String lic) {
        licenseNumber = lic;
    }

    public void setMinutesParked(int min) {
        minutesParked = min;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public String toString() {
        return "Make: " + make + "\nMode: " + model + "\nColor: " + color 
+ "\nLicense Number: " + licenseNumber + "\nMinutes Parked: " + 
minutesParked;
    }
}

