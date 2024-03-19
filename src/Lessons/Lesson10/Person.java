package Lessons.Lesson10;

public class Person {

    private String name;

   private  int age;

   private char sex;

    public Person(String name) {
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

    //    String getName() {
//        String prefix = ""; // while we don't know it, it's empty
//
//        if (Character.toLowerCase(sex) == 'm') {
//            prefix = "Mr. ";
//        } else if (Character.toLowerCase(sex) == 'f') {
//            prefix = "Mrs. ";
//        }
//        return prefix + name;
//    }
}
