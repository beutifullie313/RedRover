package Homeworks.Homework_9;

import Homeworks.Homework_9.Month;

public class Employee {

    private String name;

    private int age;

    private char sex;

    private double dailySalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;

    }

//    public Employee(int dailySalary) {
//        this.dailySalary = dailySalary;
//    }

    public double getSalary(Month[] monthArray){ // dailySalary * Month.workingDaysNumber * monthArray.length
        double salary = 0.0;
        for (int i =0; i < monthArray.length; i++ ){
           salary = monthArray[i].getWorkDaysNumber() * dailySalary;
        }
        return salary;




    }
}
