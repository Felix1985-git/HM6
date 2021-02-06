package academy.belhard;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private int value;
        public Car(int wheelCount,int doorsCount) {
        super(wheelCount);
        this.doorsCount=doorsCount;
               }
    public Car(int wheelCount,int doorsCount,int value) {
        super(wheelCount);
        this.doorsCount=doorsCount;
        this.value=value;
    }
    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Машина - "+"Количество дверей: "+doorsCount+" - Количество колес: "+wheelCount+" - Цена: "+getCost());
    }

    @Override
    public int getCost() {
        return value;
    }
}
