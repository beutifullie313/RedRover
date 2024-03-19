package Lessons;

public class Lesson3 {
        public static void main(String[] args) {

//                    if (forCheburashka * 2 > totalOranges) {
//                System.out.println("Cheburashka is so mean!");
//            } else {
//                System.out.println("Cheburashka is a good boy");
//        }
//            System.out.println("The end");
//        }
//        Additional conditions:
            int totalOranges = 10;
            int forCheburashka = 5;

            int forGena = totalOranges - forCheburashka;
            if (forCheburashka > forGena) {
                System.out.println("Cheburashka is so mean");
            } else if (forGena > forCheburashka) {
                System.out.println("Gena is so mean");
            } else {
                System.out.println("Both are good friends");
            }
            System.out.println("The end");

        }
}
