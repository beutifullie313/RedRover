package Homeworks.Homework_9;

public class Manager {

//     Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных. Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
////    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

   private String name;

    private int age;

    private char sex;

    private double dailySalary;

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

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
        return salary * (1 + numberOfSubordinates * 0.01);




    }
}