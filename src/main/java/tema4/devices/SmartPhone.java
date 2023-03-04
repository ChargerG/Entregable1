package tema4.devices;

import tema4.SmartDevice;

public class SmartPhone extends SmartDevice {
    boolean phoneTypeGamer;
    boolean headphones;
    String chargerType;
    boolean includeWires;
    int quantityOfSimcards;

    public SmartPhone(){}

    public SmartPhone(String deviceName, String size, float weight, String memory, String color, String displayType, String displaySize, String makeOfDevice, boolean phoneTypeGamer, boolean headphones, String chargerType, boolean includeWires, int quantityOfSimcards) {
        super(deviceName, size, weight, memory, color, displayType, displaySize, makeOfDevice);
        this.phoneTypeGamer = phoneTypeGamer;
        this.headphones = headphones;
        this.chargerType = chargerType;
        this.includeWires = includeWires;
        this.quantityOfSimcards = quantityOfSimcards;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "phoneTypeGamer=" + phoneTypeGamer +
                ", headphones=" + headphones +
                ", chargerType='" + chargerType + '\'' +
                ", includeWires=" + includeWires +
                ", quantityOfSimcards=" + quantityOfSimcards +
                "} \n\n" + super.toString();
    }
}
