package Person;

import Person.Employee;
import Person.Manager;

public class Homework_7 {

//   - Задача №1
//
//    Необходимо создать класс Person с полями: имя, возраст, пол.
//    Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
//    если пол указан как мужской и префикс “Mrs. ” если женский.

//    public static void main(String[] args) {

//        Person person1 = new Person();
//        person1.name = "Jack";
//        person1.age = 30;
//        person1.sex = 'M';
//
//        System.out.println(person1.getName());
//
//        Person person2 = new Person();
//        person2.sex = 'x';
//        person2.name = "Linda";
//        person2.age = 18;
//
//        System.out.println(person2.getName());

//
//        }
//
//    }

    //
//
//    Задача №2
//
//    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//    Класс должен иметь метод isSameName(Employee employee) который возвращает true,
//    если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
    public static void main(String[] args) {
        Employee peter = new Employee(); // from Employee class
        peter.name = "Peter Griffin";
        peter.age = 45;
        peter.sex = 'm';
        peter.salary = 1000.0;

        Manager cleveleand = new Manager(); // from manager class
        cleveleand.name = "Ceveland Brown";
        cleveleand.subordinates = new Employee [] {peter, };

        System.out.println(peter.isSameName(cleveleand));

        Employee evilPeter = new Employee();
        evilPeter.name = "Peter Griffin";
        evilPeter.age = 45;
        evilPeter.sex = 'm';
        evilPeter.salary = 2000.0;

        System.out.println(peter.isSameName(evilPeter)); //true, same name
//        System.out.println(cleveland.subordinates);

        System.out.println(peter.equals(evilPeter)); //false- they are different people
    }
}

    //Задача №3
//
//    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
//    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
//
//    public static void main(String[] args) {
//        Employee peter = new Employee();
//        peter.name = "Peter Griffin";
//        peter.age = 45;
//        peter.sex = 'm';
//        peter.salary = 1000.0;
//
//        Employee cleveleand = new Employee();
//        cleveleand.name = "Ceveland Brown";
//        cleveleand.salary = 1200.0;
//
//        Employee evilPeter = new Employee();
//        evilPeter.name = "Peter Griffin";
//        evilPeter.age = 45;
//        evilPeter.sex = 'm';
//        evilPeter.salary = 2000.0;
//
//        Employee[] employees = {peter, cleveleand, evilPeter};
//
//        System.out.println(Salary.getSum(employees));
//    }
//}

