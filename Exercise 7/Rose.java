//Ocean Lu
//Zander Ilagen
//CS 141
//Exercise 7
//11.08.17

public class Rose extends Flower {

    public int thorns;

    public Rose(int t) {
        super();
        thorns = t;
    }

    public void setThorns(int t) {
        thorns = t;
    }

    public int getThorns() {
        return thorns;
    }

    public void setNames(String n) {
        super.setNames(n + " Rose");
    }
}

