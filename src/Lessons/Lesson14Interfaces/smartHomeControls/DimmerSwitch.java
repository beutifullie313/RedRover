package Lessons.Lesson14Interfaces.smartHomeControls;

import Lessons.Lesson14Interfaces.smartHome.devices.DimmableBulb;
import Lessons.Lesson14Interfaces.smartHome.devices.Kettle;

public class DimmerSwitch {

    public DimmerSwitch (SwitchableAndAdjustable device){
        this.device = device;
    }



    private DimmableBulb bulb;

    public void turnOn() {
        device.turnOn();

    }

    public void turnOff() {
        device.turnOff();

    }

    public void adjust( int percent){
        bulb.adjustBrightness(percent);

    }


}
