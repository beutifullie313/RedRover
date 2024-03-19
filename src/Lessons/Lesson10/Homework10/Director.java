package Lessons.Lesson10.Homework10;

public class Director extends Manager {


    @Override
    public double getSalary() {
        double resultSalary = super.getSalary();
        if (super.getSubordinates() != 0){
            resultSalary *= 3;  // Т.к getSalary у базового класса высчитываеться по формуле <базовая ставка> * (<количество подчиненных> / 100 * 3) а формула для Director:
                               // <базовая ставка> * (<количество подчиненных> / 100 * 9), то просто домнажаем наш результат на 3 и получаем верные расчеты.
        }
        return resultSalary ;
    }
}
