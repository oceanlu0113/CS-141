//Ocean Lu
//CS141
//Assignment 4
//11.15.17 

public class Essay extends GradedActivity {

    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public void setScore(double gr, double sp, double len, double cnt) {
        grammar = gr;
        spelling = sp;
        correctLength = len;
        content = cnt;
    }

    public void setGrammar(double g) {
        grammar = g;
    }

    public void setSpelling(double s) {
        spelling = s;
    }

    public void setCorrectLength(double c) {
        correctLength = c;
    }

    public void setContent(double c) {
        content = c;
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getScore() {
        return grammar + spelling + correctLength + content;
    }
}

