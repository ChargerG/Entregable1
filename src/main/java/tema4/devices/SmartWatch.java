package tema4.devices;

import tema4.SmartDevice;

import java.util.List;

public class SmartWatch extends SmartDevice {
    String handleType;
    boolean solarCharge;
    List<String> multiplePlatform;
    boolean stepMarker;
    boolean callAnsweringSystem;

    public SmartWatch(){}

    public SmartWatch(String deviceName, String size, float weight, String memory, String color, String displayType, String displaySize, String makeOfDevice, String handleType, boolean solarCharge, List<String> multiplePlatform, boolean stepMarker, boolean callAnsweringSystem) {
        super(deviceName, size, weight, memory, color, displayType, displaySize, makeOfDevice);
        this.handleType = handleType;
        this.solarCharge = solarCharge;
        this.multiplePlatform = multiplePlatform;
        this.stepMarker = stepMarker;
        this.callAnsweringSystem = callAnsweringSystem;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "handleType='" + handleType + '\'' +
                ", solarCharge=" + solarCharge +
                ", multiplePlatform=" + multiplePlatform +
                ", stepMarker=" + stepMarker +
                ", callAnsweringSystem=" + callAnsweringSystem +
                "} \n\n" + super.toString();
    }
}
