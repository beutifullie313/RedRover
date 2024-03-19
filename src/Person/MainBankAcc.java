package Person;

public class MainBankAcc {

    //    public static void main(String[] args) {
//        BankAccount acct1 = new BankAccount("12345");
//        System.out.println(acct1.getBalance());
//
//        acct1.credit(1000.0);
//        System.out.println(acct1.getBalance());
//
//        acct1.debit(100.0);
//        System.out.println(acct1.getBalance());
    public static void main(String[] args) {
        Date olddate = new Date(20, 02, 2024);

        Date date = olddate.plusDays(2);

        System.out.print(date.getDay());
        System.out.print("-");
        System.out.print(date.getMonth());
        System.out.print("-");
        System.out.print(date.getYear());
    }


}

