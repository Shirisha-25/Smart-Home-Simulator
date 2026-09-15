public class AC implements SmartDevice {

    private String name;
    private boolean isOn;
    private int temperature;

    public AC(String name) {
        this.name = name;
        this.isOn = false;
        this.temperature = 24;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is OFF");
    }

    public void setTemperature(int temperature) {

        if (temperature >= 16 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println(name + " temperature set to "
                    + temperature + "°C");
        } else {
            System.out.println(
                "Temperature must be between 16°C and 30°C"
            );
        }
    }

    @Override
    public void showStatus() {
        System.out.println(name + " : "
                + (isOn ? "ON, Temperature = " + temperature + "°C"
                        : "OFF"));
    }
}