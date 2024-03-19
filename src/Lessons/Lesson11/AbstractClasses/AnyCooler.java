//package Lessons.Lesson11.AbstractClasses;
//
//public abstract class AnyCooler {
//
//
//
//    // copy from Fudjitsu anything which is common for any cooler
//    private final int targetTemp;
//
//    public AnyCooler(int targetTemp) {
//        this.targetTemp = targetTemp;
//    }
//
//
//    protected int getTargetTemp(){
//        return targetTemp;
//    }
//
//    public final void adjustTemp(int currentTemp) { //change temp
//        if (currentTemp >= getTargetTemp() && !isCurrentlyCooling()) {
//            System.out.println("Turning it on");
//            turnAcOn();
//        } else if (currentTemp < getTargetTemp() && isCurrentlyCooling()){
//            System.out.println("Turning it off");
//            turnAcOff();
//        }else{
//            System.out.println("Nothing to do");
//        }
//
//
//}
//
//    protected abstract void turnAcOn() {
//    }
//
//    protected abstract boolean isCurrentlyCooling();
//
//
//    private abstract void turnAcOff();
//    }

