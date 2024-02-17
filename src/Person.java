public class Person {

    String name;

    int age;

    String sex;


    void getName (String name) {

            if(sex == "man"){
                System.out.println("Mr." + name);
            } else
                System.out.println("Mrs." + name);

    }
}
