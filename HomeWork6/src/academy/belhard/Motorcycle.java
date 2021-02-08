package academy.belhard;

public class Motorcycle extends Vehicle implements Costable {
    private int maxSpeed;
    private int value;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle(int wheelCount, int maxSpeed, int value) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
        this.value = value;
    }

    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл - " + "Количество колес: " + wheelCount + " - Максимальная скорость: " + maxSpeed + " - Цена: " + getCost());
    }

    @Override
    public int getCost() {
        return value;
    }
}
