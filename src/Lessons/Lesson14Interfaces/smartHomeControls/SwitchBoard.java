package Lessons.Lesson14Interfaces.smartHomeControls;

import Lessons.Lesson14Interfaces.smartHome.devices.Kettle;
import Lessons.Lesson14Interfaces.smartHome.devices.Switchable;

import java.util.ArrayList;
import java.util.List;

public class SwitchBoard implements Switchable { //this method is for switching all instances at the same time

    private List<Switchable> allSwitchables = new ArrayList<>();



    @Override
    public void turnOn() {
        for(Switchable device:allSwitchables)
        device.turnOn();


    }

    @Override
    public void turnOff() {
        for(Switchable device:allSwitchables)
        device.turnOff();

    }

    public void addDevice(Switchable device){
        allSwitchables.add(device);
    }


}
