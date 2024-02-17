public class PersonClassUsage {
    public static void main(String[] args) {

        //THIS IS SPECIFIC PERSON
        // Inctance of class
//        Person_Class person1 = new Person_Class();
//
//        person1.name = "Sergei";
//        person1.age = 20;

//        Person_Class p2 = new Person_Class();
//        p2.Person_Class.name = "Anna";
//        p2.age = 30;

// use constructor
        Person_Class p1 = new Person_Class("Swergei", 30);

        p1.setName("Ivan");

        System.out.println(p1.getName());

     Worker worker = new Worker("Ivan", 40, 23400){

     }




//

//        Worker work = new Worker();
//
//        work.name = "Oleg"; // line work from class person which used in worker
//        work.age = 35; // from person
//        work.salary = 24000; // from worker
//
//        System.out.println((work.getName()));
    }
}
