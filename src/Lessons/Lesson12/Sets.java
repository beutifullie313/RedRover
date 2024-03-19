package Lessons.Lesson12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Map <Character, Integer> charCount = new HashMap<>();

        String string = "dfghjmkhngfddddddddddddfgggggggggggggggggggg";
        for( char c: string.toCharArray()){// c = first element, turn string to array
            int currentCount = charCount.getOrDefault(c, 0);//0
            charCount.put(c,currentCount +1); //{d=13, f=3, g=22, h=2, j=1, k=1, m=1, n=1}
        }

        System.out.println(charCount);

        // SET:

//        Set<String> mySet = new HashSet<>();
//        mySet.add("vasya");
//        mySet.add("petya");
//        mySet.add("Nikolai");
//        mySet.add("vasya");
//
//        System.out.println(mySet.size());//3
//        System.out.println(mySet);//[vasya, petya, Nikolai]
//
//        Set<Person> people = new HashSet<>();
//        Person vasya = new Person("Vasya");
//        people.add(vasya);
//        people.add(vasya);
//        people.add(new Person("Nikolai Vasilevich"));
//
//        for(Person p : people){//each iteration element will have variable p
//            System.out.println(p.name);
//        }

        // MAP:

//        Map <String, Person> people = new HashMap<>();
//        people.put("1", new Person("Vasya"));// id:1, name: Vasya = not an index, key:value
//        people.put("2", new Person("Nikolai"));
//        people.put("2", new Person("Kostya"));
//
//        people.put("1", new Person ("ChangedName"));//change person with id 1
//
//        for (String key: people.keySet()) { //all keys
//            System.out.println("Key = " + key + ", value = " + people.get(key));
//        }
//
//        System.out.println(people);
//        System.out.println(people.getOrDefault("2", new Person("AAAAAAAAAA"))); // Person Kostya
//        System.out.println(people.getOrDefault("4", new Person("AAAAAAAAAA")));//Person AAAAAAAAAA
//
//
//
//    }
//
//    private static class Person {
//        private final String name;
//
//        private Person(String name) {
//            this.name = name;
//        }
//
//        public String toString(){
//            return "Person " + name;
//        }
    }
}
