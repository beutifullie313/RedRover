import java.util.Locale;

public class Homework6_1 {
    public static void main(String[] args) {
//       + Задача №1

//        Дана строка:
        //String s = "Перестанoвoчный алгoритм быстрoгo действия";
//////        необходимо вывести все буквы “о” из этой строки.
//////                Для указанной строки ответ будет “ооооо” (или в столбик)
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'o') {
//                System.out.print(s.charAt(i));
//            }
//        }


//
//
//        + Задача №2
//
//        Дана строка:
//        String s = "Перевыборы выбранного президента";
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
//
//        int count = 0;
//        for (int i = 0; i < s.length(); i++){
//
//            if (s.charAt(i) == 'е') {
//
//                count++;
//            }
//        }
//        System.out.println(count);
//
//
//        Задача №3
//
//        Дана строка:
//        String s = "Посмотрите как Рите нравится ритм"; // original string
//////        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//////                Для указанной строки ответ будет 6, 15, 29.
////   MY SOLUTION:
//        String targetString = "рит"; // substring with target piece of text
//        String resultString = s.toLowerCase(); // original
////        int index = 0; // we start with index 0, which will be our result
//
//        String lowerCaseSubstring = targetString.toLowerCase(); // our target substring will also be lowercased in case we put there other uppercased letters
//
//        int index = resultString.indexOf(lowerCaseSubstring); // find the first appearance of our target substring
//        while (index != -1) { // loop if there's no appearance of target substring which returns -1
//            System.out.println(index); // print this first met index
//            index = resultString.indexOf(lowerCaseSubstring, index + lowerCaseSubstring.length()); //skip the first met substring and its length to find any other appearances of our target substring
//        }
//    }
// TEACHER'S SOLUTION:

//       s = s.toLowerCase(); // original
//        for (int i =0; i < s.length() - 3; i++){ // not to override the length string we add - 3
//            String subStr = s.substring(i, i + 3);
//            if (subStr.equals("рит")) {
//                System.out.println(i);
//            }
//    }
//


//
//        Экстра задача
//
//        Дан массив:
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е"))
                    count++;
                }
                System.out.println(count);
            }
        }
    }


