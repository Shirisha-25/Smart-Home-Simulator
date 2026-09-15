public class Fan implements SmartDevice {

    private String name;
    private boolean isOn;
    private int speed;

    public Fan(String name) {
        this.name = name;
        this.isOn = false;
        this.speed = 0;
    }

    @Override
    public void turnOn() {
        isOn = true;
        speed = 1;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        speed = 0;
        System.out.println(name + " is OFF");
    }

    public void setSpeed(int speed) {

        if (speed >= 1 && speed <= 5) {
            this.speed = speed;
            System.out.println(name + " speed set to " + speed);
        } else {
            System.out.println("Speed must be between 1 and 5");
        }
    }

    @Override
    public void showStatus() {
        System.out.println(name + " : "
                + (isOn ? "ON, Speed = " + speed : "OFF"));
    }
}