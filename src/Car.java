public class Car extends Vecihle{

    private int wheels;
    private String type;
    private String color;
    private int doors;
    private int gears;
    private boolean isManuel;
    private int currentGear;

    public Car(String name, int wheels, int doors, int gears, boolean isManuel, String type, String color) {
        super(name);
        this.type = type;
        this.color = color;
        this.gears = gears;
        this.doors = doors;
        this.isManuel = isManuel;
        this.wheels = wheels;
        currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("changeGear method called: Changed to "+ this.currentGear + "gear ");
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("Change speed method called: Speed -> "+ newSpeed+" Direction -> "+ newDirection);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManuel() {
        return isManuel;
    }

    public void setManuel(boolean manuel) {
        isManuel = manuel;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
