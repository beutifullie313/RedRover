package Lessons.Lesson14Interfaces.smartHome.devices;

public class Kettle implements Switchable{

    public void turnOn(){

        System.out.println("Heating water");
    }

    public void turnOff(){
        System.out.println("Not heating water");
    }
}
