package Lessons.Lesson10;

public class Gentleman extends Person {

    private String address;

    public Gentleman(String name, int age, String address){
        super(name);
    }

    public Gentleman(String name) {
       super(name);
    }

    @Override
    public String getName(){
        return "Mr ." + super.getName();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
