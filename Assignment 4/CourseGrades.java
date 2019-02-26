//Ocean Lu
//CS141
//Assignment 4
//11.15.17 
public class CourseGrades implements Analyzable {

    private final int NUM_GRADES = 4;
    private GradedActivity[] grades = new GradedActivity[NUM_GRADES];

    public CourseGrades() {
        this.grades = grades;
    }

    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }

    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    public String toString() {
        return "Lab Grade: " + grades[0].getGrade() + "\nExam Grade: " + grades[1].getGrade() + "\nEssay Grade: " + grades[2].getGrade() + "\nFinal Exam Grade: " + 
grades[3].getGrade();
    }
    
    public double getAverage() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += grades[i].getScore();
        }
        return total/4;
    }
    
    public GradedActivity getHightest() {
        double highest = grades[0].getScore();
        int keeper = 0;
        for (int i = 1; i < 4; i++) {
            if (highest < grades[i].getScore()) {
                highest = grades[i].getScore();
                keeper = i;
            }
        }
        return grades[keeper];
    }
    
    public GradedActivity getLowest() {
        double lowest = grades[0].getScore();
        int keeper = 0;
        for (int i = 1; i < 4; i++) {
            if (lowest > grades[i].getScore()) {
                lowest = grades[i].getScore();
                keeper = i;
            }
        }
        return grades[keeper];
    }

    @Override
    public GradedActivity getHighest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

