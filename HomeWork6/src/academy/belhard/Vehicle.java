package academy.belhard;

public abstract class Vehicle {
    protected int wheelCount;
    protected Vehicle(int wheelCount){
        this.wheelCount=wheelCount;
    }

    protected void printInfo() {
        System.out.print("Транспортное средство: ");
       }
}
