public class Gym {
    public static void main(String[] args) {
        Blin b1 = new Blin();
        b1.min = 0;
        b1.max = 10;
        b1.whoAreYou = "Ameba";

        Blin b2 = new Blin();
        b2.min = 11;
        b2.max = 30;
        b2.whoAreYou = "Kachok";

        Blin b3 = new Blin();
        b3.min = 31;
        b3.max = 50;
        b3.whoAreYou = "Mashina";

        Blin b4 = new Blin();
        b4.min = 51;
        b4.max = 1000;
        b4.whoAreYou = "Biorobot";

        Blin[] machine = {b1, b2, b3, b4};

        int myWeight = 500;

        for(int i =0; i <machine.length; i++){
//            Blin blin = machine[i];
//            if(myWeight > blin.min && myWeight< blin.max) {
//                System.out.println(blin.whoAreYou);

            machine[i].printWhoAreYou(myWeight);
            }
        }
    }
