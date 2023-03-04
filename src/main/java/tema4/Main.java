package tema4;

import tema4.devices.SmartPhone;
import tema4.devices.SmartWatch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> platforms = new ArrayList<>();
        platforms.add("iOS");
        platforms.add("Android");

        SmartDevice devicePhone = new SmartPhone("Galaxy S21", "3 x 2 inches", 100.21f, "8GB RAM+128GB ROM", "Black", "Diamond", "2.95 x 1.95 inches", "Samsung", true, false, "Wireless",false, 1);
        SmartDevice deviceWatch = new SmartWatch("T500", "1.95 inches", 10.4f, "8GB RAM+64GB ROM", "Blue Spacial", "HD Diamond", "1.90 x 1 inches", "Apple","Oro Pink", true, platforms, true, true);

        System.out.println(devicePhone + "\n\n" + deviceWatch);
    }
}
