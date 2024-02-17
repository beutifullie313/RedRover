public class Person_Class {

    // THIS IS AN ABSTRACT PERSON

    String name; 

    int age;

    // constructor
    Person_Class(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;

//        int getAge(){
//            return age;
        }

    void setName(String ivan) {
    }
    void setAge(int age){
        this.age = age;
    }

    public Person_Class(int age) {
        this.age = age;
    }
}

