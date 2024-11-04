package hufs_compsil.ex5_10;

public class Car {
    private int maxSpeed;
    public String brandName;
    public int speed;

    public Car(String brandName) {
        this.brandName = brandName;

    public Car(String brandName, int maxSpeed) {
        this(brandName);
        this.maxSpeed = maxSpeed;
    }

    public int speedUp() {
        return speed += 30;
    }

    public int speedDown() {
        return speed -= 20;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        //이어서...
    }
    }
}
