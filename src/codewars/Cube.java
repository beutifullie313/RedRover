package codewars;

public class Cube {
        private int side;
        private String name;

        public  String lastName;



    public Cube(int side, String name) {
        this.side = side;
        this.name = name;
    }



    public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getSide(){
            return side;
        }
        public void setSide(int side){
            this.side = side;
        }

        public  void setLastName(String value){
        lastName = value;
        }

    public  String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Cube name +" + name + "Cube last name + " + lastName;

    }
}
