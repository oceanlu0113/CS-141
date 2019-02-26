//Ocean Lu
//CS141
//Assignment 2
//10.23.17

public class PoliceOfficer {

    private String name;
    private String badgeNumber;

    public PoliceOfficer(String n, String bn) {
        name = n;
        badgeNumber = bn;
    }

    public PoliceOfficer(PoliceOfficer officer2) {
        name = officer2.getName();
        badgeNumber = officer2.getBadgeNumber();
    }

    public void setName(String n) {
        name = n;
    }

    public void setBadgeNumber(String bn) {
        badgeNumber = bn;
    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        if (meter.getMinutes() < car.getMinutesParked()) {
            int i = car.getMinutesParked() - meter.getMinutes();
            ParkingTicket ticket = new ParkingTicket(car, this, i);
            return ticket;
        } else {
            return null;
        }
    }

    public String toString() {
        return "Name: " + name + "\nBadge Number: " + badgeNumber;
    }
}
