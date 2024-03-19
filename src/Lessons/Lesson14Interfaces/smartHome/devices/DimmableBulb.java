package Lessons.Lesson14Interfaces.smartHome.devices;

public class DimmableBulb extends LightBulb implements Adjustable {

    //extends all methods of light bulb

    public void adjustBrightness(int percent){
        System.out.println("Light brightness is adjusted");
    }

    @Override
    public void adjust(int percent) {
        adjustBrightness(percent);
    }
}
