package Apartments;

public class Apartment_1 {
    public static void main(String[] args) {

        // this file contains objects with the same schema from file Apartments.Apartment

        //int myVar = 12; has the same structure as Apartments.Apartment apt1 = new Apartments.Apartment();

        Apartment apt1 = new Apartment();
        apt1.bedrooms = 2;
        apt1.address = new Address();
        apt1.address.city = "San Francisco";
        apt1.address.state = "CA";
        apt1.price = 3500;

        Apartment apt2 = new Apartment();
        apt2.bedrooms = 4;
        apt2.address = new Address();
        apt2.address.city = "Atlanta";
        apt2.address.state = "GA";
        apt2.price = 2500;

        Apartment apt3 = new Apartment();
        apt3.bedrooms = 5;
        apt3.address = new Address();
        apt3.address.city = "Fresno";
        apt3.address.state = "CA";
        apt3.price = 1500;

        Apartment apt4 = new Apartment();
        apt4.bedrooms = 5;
        apt4.address = new Address();
        apt4.address.city = "San Francisco";
        apt4.address.state = "CA";
        apt4.price = 2500;


        Apartment[] apts = {apt1, apt2, apt3, apt4};

        // I want to find all apts in SanFran and print its price

//        for (int i = 0; i < apts.length; i++) {
//            Apartments.Apartment currentAppt = apts[i]; // current element of apts array
//            boolean isInSF = currentAppt.address.city.equals("San Francisco");
//            if (isInSF) {
////            if(currentAppt.city.equals("San Francisco")){
//                System.out.println("Bedrooms: " + currentAppt.bedrooms);
//                System.out.println("Price: " + currentAppt.price);

                // I want to find apts not more than 2500$

                for (int i = 0; i < apts.length; i++) {
                    if (apts[i].price <= 2500) {
                        System.out.println(apts[i].getInfoCard());

                    }
                }



    }
}
