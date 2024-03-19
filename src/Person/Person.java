package Person;

public class Person {

    String name;

    int age;

    char sex;


    String getName() {
        String prefix = ""; // while we don't know it, it's empty

        if (Character.toLowerCase(sex) == 'm') {
            prefix = "Mr. ";
        } else if (Character.toLowerCase(sex) == 'f') {
            prefix = "Mrs. ";
        }
        return prefix + name;
    }
}
