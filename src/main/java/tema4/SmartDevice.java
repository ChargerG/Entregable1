package tema4;

public abstract class SmartDevice {
    String deviceName;
    String size;
    float weight;
    String memory;
    String color;
    String displayType;
    String displaySize;
    String makeOfDevice;

    public SmartDevice(){}

    public SmartDevice(String deviceName, String size, float weight, String memory, String color, String displayType, String displaySize, String makeOfDevice) {
        this.deviceName = deviceName;
        this.size = size;
        this.weight = weight;
        this.memory = memory;
        this.color = color;
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.makeOfDevice = makeOfDevice;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "deviceName='" + deviceName + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", memory='" + memory + '\'' +
                ", color='" + color + '\'' +
                ", displayType='" + displayType + '\'' +
                ", displaySize='" + displaySize + '\'' +
                ", makeOfDevice='" + makeOfDevice + '\'' +
                '}';
    }
}
