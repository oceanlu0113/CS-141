//Ocean Lu
//Zander Ilagen
//CS 141
//Exercise 7
//11.08.17

public class Foxgloves extends Flower{
    public boolean poison;
    
    public Foxgloves (boolean p) {
        super();
        poison = p;
    }
    
    public void setPoison(boolean p) {
        poison = p;
    }
    
    public String getPoison() {
        if (poison) {
            return "yes";
        }
        else {
            return "no";
        }
    }
    
    public void setName(String n) {
        super.setNames(n + " Foxglove");
    }
}

