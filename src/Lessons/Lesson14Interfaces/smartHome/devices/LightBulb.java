package Lessons.Lesson14Interfaces.smartHome.devices;

public class LightBulb implements Switchable{

    public void turnOn(){
        System.out.println("Light is on");
    }

    public void turnOff(){
        System.out.println("Light is off");
    }
}
