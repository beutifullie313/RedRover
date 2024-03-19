package Homeworks.Homework_9;

public class Month {

   private String name;

    private int daysNumber;

    private int workDaysNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public int getWorkDaysNumber() {
        return workDaysNumber;
    }

    public void setWorkDaysNumber(int workDaysNumber) {
        this.workDaysNumber = workDaysNumber;
    }

    public Month(String name, int daysNumber, int workDaysNumber) {
        this.name = name;
        this.daysNumber = daysNumber;
        this.workDaysNumber = workDaysNumber;
    }

    @Override
    public String toString (){
        return name + daysNumber + workDaysNumber;
    }
}
