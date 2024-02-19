package lesson15;

public class Car {
    String color;
    String bodyType;
    int refuel;
    int drive;

    public Car(String color, String bodyType, int refuel, int drive) {
        this.color = color;
        this.bodyType = bodyType;
        this.refuel = refuel;
        this.drive = drive;
    }
    public void startEngine() {
        System.out.println("Start");
    }
}
