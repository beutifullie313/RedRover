//package Homeworks.Homework_9.Homework11;
//
//public class Homewrok10 {
////    + Задача №1
////
////    Необходимо создать класс Employee со следующими методами:
////    getBaseSalary - получить базовую ставку
////            setBaseSalary
////    getName - получить имя
////    setName
////    getSalary - получить зарплату
//
//    public static void main(String[] args) {
//        Employee john = new Employee();
//        System.out.println(john.getName());
//        john.setName("Victor");
//        System.out.println(john.getName());
//        System.out.println(john.getSalary());
//        System.out.println(john.getBaseSalary());
//
//
////    +-Задача №2 // getSalary returns baseSalary, not counting it
////
////    Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
////
//        Worker worker = new Worker();
//        System.out.println(worker.getSalary()); // returns worker's baseSalary
////
////
////
////    Необходимо создать класс Manager в который нужно добавить следующие методы:
////    getNumberOfSubordinates - получить количество подчиненных
////            setNumberOfSubordinates
////
////    в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
//
//        Manager manager = new Manager();
//        System.out.println(manager.getSalary());
//
//
////    Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
//        Director director = new Director();
//        System.out.println(director.getSalary());
//    }
//}
//
//
//
//
////
////
////   - Задача №3
////
////    Необходимо создать утилитарный класс со следующими методами:
////    поиск сотрудника в массиве по его имени
////    поиск сотрудника в массиве по вхождению указанной строки в его имени
////    подсчет зарплатного бюджета для всех сотрудников в массиве
////    поиск наименьшей зарплаты в массиве
////    поиск наибольшей зарплаты в массиве
////    поиск наименьшего количества подчиненных в массиве менеджеров
////    поиск наибольшего количества подчиненных в массиве менеджеров
////    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
////    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//
//
//
