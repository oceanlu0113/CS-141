//Ocean Lu
//CS141
//Assignment 2
//10.23.17

public class ParkingTicket {

    private ParkedCar car;
    private PoliceOfficer officer;
    private int minutes;
    private double fine;
    private double BASE_FINE = 35.0;
    private double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min) {
        car = aCar;
        officer = anOfficer;
        minutes = min;
    }

    public ParkingTicket(ParkingTicket ticket2) {
        car = ticket2.getCar();
        officer = ticket2.getOfficer();
        minutes = ticket2.getMinutes();
        fine = ticket2.getFine();
    }

    public void calculateFine() {
        int i = minutes / 60;
        fine = BASE_FINE + (HOURLY_FINE * i);
    }

    public void setCar(ParkedCar c) {
        car = c;
    }

    public void setOfficer(PoliceOfficer o) {
        officer = o;
    }

    public void setMinutes(int m) {
        minutes = m;
    }

    public int getMinutes() {
        return minutes;
    }

    public ParkedCar getCar() {
        return car;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public double getFine() {
        calculateFine();
        return fine;
    }

    public String toString() {
        return "Car Data: \n" + car.toString() + "\n\nOfficer Data: \n" + officer.toString() + "\n\nMinutes Illegally Parked: " + getMinutes() + "\nFine: $" + getFine();
    }
}

