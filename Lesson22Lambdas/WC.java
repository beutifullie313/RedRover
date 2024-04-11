package Lessons.Lesson22Lambdas;

import java.util.List;

public class WC {//WordCount

    static class Counters {

        private int words;// =0
        private int lines;// =0

        public void addWords(int noOfWords) {
            words += noOfWords;
        }

        public void addLines(int noOfLines) {
            lines += noOfLines;
        }
        public String getString(){
            return String.format("Lines: %s, Words: %s", lines, words)
        }
    }

    public static Counters wc(List<String> lines) {
        lines.stream()
                .reduce(// returns 1 counter
                        new Counters(),// accumulator
                        (counters, line) -> {
                            counters.addLines(1);//+1 every iteration
                            counters.addWords(line.split(" ").length);
                            return counters;
                        },
                        (c1, c2) -> {//counter1 + counter2
                            c1.addWords(c2.words);
                            c1.addLines(c1.lines);
                            return c1;
                        }
                );

    public static void main(String[] args) {
        System.out.println(List.of(
                "This is my first line",
                "Second line",
                "Third line",
                "I'm really tired of typing lines"
        )).getString());
    }
    }

}

