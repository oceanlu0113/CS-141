//Ocean Lu
//CS 141
//Assignment 1
//10.11.17

public class Minion {

    private String Name;
    private int Eyes;
    private String Phrase;

    public void setName(String n) {
        Name = n;
    }

    public void setEyes(int i) {
        Eyes = i;
    }

    public void setPhrase(String p) {
        Phrase = p;
    }

    public String getName() {
        return Name;
    }

    public int getEyes() {
        return Eyes;
    }

    public void sayPhrase() {
        System.out.println(Phrase);
    }

    public Minion(String name) {
        Name = name;
        Eyes = 2;
    }
}
