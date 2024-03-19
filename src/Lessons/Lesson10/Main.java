package Lessons.Lesson10;


public class Main {

    public static void main(String[] args) {


//        Person p = new Person("Sergei", 55);
//
//        Gentleman g = new Gentleman("Ivan", 12);
//        g.setAddress("dfgfgdfgd");
//
//        Person p = g;
//        System.out.println(p.getClass());
//
//        Person p = new Gentleman("Iven", 14, "London");
//        System.out.println(p.getName());
//
//        Gentleman g = (Gentleman) p; //prinuditelnoe privedeniye tipa
//        System.out.println(g.getAddress());


        Person[] arr = {
                new Person("Anne"),
                new Gentleman("Scott", 26, "London"),
                new Gentleman("Lion")
                };


//        Gentleman a = new Gentleman("Sergey", 30);
//
//        System.out.println(a.getName());
//
//        Person p = new Person("Anna", 35);
//
//        System.out.println(p.getName());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());


        }
    }
}

