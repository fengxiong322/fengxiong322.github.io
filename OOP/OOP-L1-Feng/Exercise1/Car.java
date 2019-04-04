public class Car {
    private String brand;
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;
    
    public Car(String b, String m, double g, double tCap) {
        brand = b;
        model = m;
        kilometres = 0;
        gas = g;
        tankCapacity = tCap;
    }
    
    public void drive(double distance) {//Tells the car to drive
        kilometres += distance;//the value (kilometres) is set to the value of (kilometres) plus the (distance)
        gas -= distance / 5;//the value (gas) is set to the value of (gas) minus a fifth of the value of (distance)
    }
    
    public void gasUp() {//Fills the car with fuel
        gas = tankCapacity;//sets the value of gas to the max tank capacity
    }
    
    public static void main(String[] args) {
        Car a = new Car ("Toyota", "Corolla", 1, 2);
        Car b = new Car ("Toyota", "86", 1, 2);
        Car c = new Car ("Toyota", "Prius", 1, 2);
        Car d = new Car ("Toyota", "Camry", 1, 2);
        Car e = new Car ("Toyota", "Avalon", 1, 2);
    }
} // Car class