package Apartments;

public class Apartment {

        // we need to describe an apartment: number of rooms, city, and price
        // this is a schema of future objects = class
        int bedrooms;
        Address address;
        int price1;
        int area;

        String getInfoCard() {
                String result =
                "\n___________" +
                        "\nPrice: " + price1 +
                        "\nBedrooms: " + bedrooms +
                        "\nCity: " + address.city +
                        "\nState: " + address.state +
                        "\n__________________";
                return result;
        }
}
