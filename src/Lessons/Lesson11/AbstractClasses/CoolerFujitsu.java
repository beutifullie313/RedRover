//package Lessons.Lesson11.AbstractClasses;
//
//public class CoolerFujitsu extends AnyCooler{
//
//    //private int targetTemp; // moved to anyCooler
//
//    public CoolerFujitsu(int targetTemp) {
//        super();
//    }
//
//    private boolean isAcOn = false;
//
////    protected int getTargetTemp(){
////        return targetTemp;
////    }   // moved to anyCooler
//
////    public void adjustTemp(int currentTemp) { //change temp
////        if (currentTemp >= getTargetTemp() && !isCurrentlyCooling()) {
////            System.out.println("Turning it on");
////            turnAcOn();
////        } else if (currentTemp < getTargetTemp() && isCurrentlyCooling()){
////            System.out.println("Turning it off");
////            turnAcOff();
////        }else{
////            System.out.println("Nothing to do");
////        } // move to anyCooler
//
//
//    }
//
//
//
//    protected void turnAcOff(){
//        this.isAcOn= false;
//    }
//
//protected void turnAcOn(){ //send Bluetooth ON signal
//        this.isAcOn = true;
//    }
//
//protected boolean isCurrentlyCooling(){
//        return isAcOn;
//    }
//
//
//}
