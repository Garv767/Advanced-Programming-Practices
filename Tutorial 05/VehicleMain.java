class Vehicle {
    int speed; int fuelCapacity;
    Vehicle(int s,int f){ speed=s; fuelCapacity=f; }
    void start(){ System.out.println("Vehicle starting..."); }
}
class Car extends Vehicle {
    int doors;
    Car(int s,int f,int d){ super(s,f); doors=d; }
    void show(){ System.out.println("Car: Speed "+speed+" Fuel "+fuelCapacity+" Doors "+doors); }
}
class Bike extends Vehicle {
    boolean helmetRequired;
    Bike(int s,int f,boolean h){ super(s,f); helmetRequired=h; }
    void show(){ System.out.println("Bike: Speed "+speed+" Fuel "+fuelCapacity+" HelmetRequired "+helmetRequired); }
}
class Truck extends Vehicle {
    int loadCapacity;
    Truck(int s,int f,int l){ super(s,f); loadCapacity=l; }
    void show(){ System.out.println("Truck: Speed "+speed+" Fuel "+fuelCapacity+" Load "+loadCapacity); }
}

public class VehicleMain {
    public static void main(String[] args){
        Car c=new Car(150,40,4);
        Bike b=new Bike(100,15,true);
        Truck t=new Truck(80,150,5000);
        c.start(); c.show();
        b.start(); b.show();
        t.start(); t.show();
    }
}
