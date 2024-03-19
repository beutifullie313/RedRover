package Lessons.Lesson14Interfaces.smartHome.devices;

import java.awt.Adjustable;

public class Stereo implements Switchable, Adjustable {


    @Override
    public void adjust(int percent) {
        System.out.println("Volume at" + percent);
    }
    @Override
    public void turnOn(){
        System.out.println("Stereo on");
    }

    @Override
    public void turnOff(){
        System.out.println("Stereo is off");
    }


}
