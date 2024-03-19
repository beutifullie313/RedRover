package Person;

public class Employee {

    String name;

    int age;

    char sex;

    double salary;

    boolean isSameName(Employee otherEmployee) {//  boolean type = is true or is false?, type employee, variable name otherEmployee
//        if(name == null) return otherEmployee.name == null;
//        return name.equals(otherEmployee.name);

        return this.name.equals(otherEmployee.name);

    }
}
