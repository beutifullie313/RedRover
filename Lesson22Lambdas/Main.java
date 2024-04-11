package Lessons.Lesson22Lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {

        // algorythm for multiplying all numbers in a list by 2
        List<Integer> integers = List.of(1, 3, 5, 7, -23, 0);
        List<Integer> result = new ArrayList<>();//empty
        for (int i : integers) {//every element in 'integers' list
            result.add(i * 2);//every number in the list will be multiplied by2
        }
        System.out.println(result);

        //algorythm of counting length of every word in a list

        List<String> words = List.of("some", "random", "list", "of", "words");
        List<Integer> wordsLength = new ArrayList<>();
        for (String s : words) {
            wordsLength.add(s.length());
        }
        System.out.println(wordsLength);

//        List<Integer> lenghts = words.stream();//stream<String>
//        .map(new Function<String>, Integer(){
//        @Override
//        public Integer apply (String s){
//            return s.lenght();
//        }
//        List<Integer> lenghts = words.stream()
//                .map(s -> s.length()
//                        .filter(u -> u<5)
//                        .distinct()
//                        .collect(toList()));
//        System.out.println(lenghts);
//        }

        System.out.println(words.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char) i))
                //.allMatch(c -> Character.isAlphabetic(c))//test if all elements are alphabetic characters
                //.anyMatch(c -> c == 'x')//do we have letter 'x' in our list?
                .allMatch(c -> {
                    boolean isLetter = Character.isAlphabetic(c);
                    boolean isNumber = Character.isDigit(c);
                    return isLetter || isNumber; //check if letter or number
                })
        );
        System.out.println(
                words
                        .stream()//Stream<String>
                        .reduce((a,b) -> a.length()> b.length() ? a:b) //find the longest word, returns Optional
        );
        System.out.println(Optional.ofNullable(null));
        System.out.println(Optional.ofNullable("xxxx"));
        System.out.println(Stream.of("a").reduce(a,b) -> a));
    }
//    static Optional <Integer> stringLength(String s){
//        return Optional.ofNullable(x -> x.length());
//    }


}
