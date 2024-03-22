package Lessons.Lesson10.Homework10;

public class Manager extends Worker {

    private int subordinates = 5;

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public double getSalary() {
        double resultSalary = super.getSalary();

        if (subordinates != 0) {
            resultSalary =  resultSalary *(double)subordinates/100*3;
        }
       return resultSalary;
    }
}




