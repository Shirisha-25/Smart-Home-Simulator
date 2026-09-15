import java.util.ArrayList;

public class SmartHome {

    private ArrayList<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Device added successfully!");
    }

    public void showAllDevices() {

        if (devices.isEmpty()) {
            System.out.println("No devices found.");
            return;
        }

        System.out.println("\n===== Device Status =====");

        for (SmartDevice device : devices) {
            device.showStatus();
        }
    }

    public ArrayList<SmartDevice> getDevices() {
        return devices;
    }
}