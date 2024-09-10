package grades;

import java.util.ArrayList;

public class ManagementGrades {
    private ArrayList<Integer> listGrades;
    public ManagementGrades() {
        this.listGrades = new ArrayList<>();
    }
    public void addGrade(Integer grade) {
        this.listGrades.add(grade);
    }
    public void showGrades() {
        Double  average = 0.0;
        for (Integer grade : this.listGrades) {
            average += grade;
        }
        average = average / this.listGrades.size();
        System.err.println("The average of the grades is " + average);
    }
    public void showApproved() {
        for (Integer grade : this.listGrades) {
            if (grade > 50) {
                System.out.println("The good grades are " + grade);
            } 
        }
    }
}
