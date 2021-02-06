package academy.belhard;

public class Main {

    public static void main(String[] args) {
	Car car=new Car(4,4,1800);
	Car car1=new Car(4,5,2000);
	car.printInfo();
    System.out.println(car.getCost());
	car1.printInfo();
	System.out.println(car1.getCost());
	Motorcycle moto=new Motorcycle(2,360,5000);
    Motorcycle moto1=new Motorcycle(2,100,1200);
    moto.printInfo();
    System.out.println(moto.getCost());
    moto1.printInfo();
    System.out.println(moto1.getCost());
    }
}
