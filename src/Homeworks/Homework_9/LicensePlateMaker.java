package Homeworks.Homework_9;

import jdk.jshell.spi.SPIResolutionException;

public class LicensePlateMaker {

    private String prefix;
    private int lastUsedNumber;

    public LicensePlateMaker(String prefix, int lastUsedNumber){
        this.prefix = prefix;
        this.lastUsedNumber = lastUsedNumber;
    }

    public Plates makeNextPlate(){
        lastUsedNumber += 1;
        int nextNumber = lastUsedNumber +1;
        lastUsedNumber = nextNumber;
        return new Plates(prefix + " - " + lastUsedNumber); // CA => CA-1, CA-2.....
    }
}
