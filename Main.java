import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SmartHome home = new SmartHome();

        Light light = new Light("Living Room Light");
        Fan fan = new Fan("Bedroom Fan");
        AC ac = new AC("Bedroom AC");

        home.addDevice(light);
        home.addDevice(fan);
        home.addDevice(ac);

        while (true) {

            System.out.println("\n===== SMART HOME SIMULATOR =====");
            System.out.println("1. Turn ON Light");
            System.out.println("2. Turn OFF Light");
            System.out.println("3. Turn ON Fan");
            System.out.println("4. Turn OFF Fan");
            System.out.println("5. Set Fan Speed");
            System.out.println("6. Turn ON AC");
            System.out.println("7. Turn OFF AC");
            System.out.println("8. Set AC Temperature");
            System.out.println("9. Show Device Status");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    light.turnOn();
                    break;

                case 2:
                    light.turnOff();
                    break;

                case 3:
                    fan.turnOn();
                    break;

                case 4:
                    fan.turnOff();
                    break;

                case 5:
                    System.out.print("Enter Fan Speed (1-5): ");
                    int speed = sc.nextInt();
                    fan.setSpeed(speed);
                    break;

                case 6:
                    ac.turnOn();
                    break;

                case 7:
                    ac.turnOff();
                    break;

                case 8:
                    System.out.print("Enter Temperature (16-30): ");
                    int temperature = sc.nextInt();
                    ac.setTemperature(temperature);
                    break;

                case 9:
                    home.showAllDevices();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}