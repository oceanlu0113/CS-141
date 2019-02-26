//Ocean Lu
//CS141
//Exercise 9
//11.27.17

public class Ship {

    private String name;
    private String yearBuilt;

    public Ship(String n, String y) {
        name = n;
        yearBuilt = y;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String n) {
        name = n;
    }

    public void setYearBuilt(String y) {
        yearBuilt = y;
    }

    public String toString() {
        return "Ship Name: " + name + "\nYear Built: " + yearBuilt;
    }
}

