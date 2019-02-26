//Ocean Lu
//CS141
//Exercise 9
//11.27.17

public class CruiseShip extends Ship {

    private int passengers;

    public CruiseShip(String n, String y, int p) {
        super(n, y);
        passengers = p;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    public void setAll(String n, String y, int p) {
        super.setName(n);
        super.setYearBuilt(y);
        passengers = p;
    }

    public String toString() {
        return "Ship Name: " + super.getName() + "\nMaximum Passengers: " + passengers;
    }

}

