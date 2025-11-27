package inheritance;

class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void move(){
        System.out.println("The vehicle is moving.. ");
    }
      public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }
}
    class Car extends Vehicle{

        public Car(String brand, int speed) {
            super(brand, speed);
        }

        @Override
        public void move(){
            System.out.println("The car is moving");
        }
    }
    class Bike extends Vehicle{

        public Bike(String brand, int speed) {
            super(brand, speed);
        }


        @Override
        public void move(){
            System.out.println("The bike is moving");
        }
    }
class Main{
    public static void main(String[] args){
        Car car = new Car("Toyota", 350);
        Bike bike = new Bike("BMW", 850);
        

        System.out.println("Car Brand : "+car.getBrand());
        System.out.println("Car Speed : "+car.getSpeed());
        car.move();

        System.out.println("Bike Brand : "+bike.getBrand());
        System.out.println("Bike Speed : "+bike.getSpeed());
        bike.move();
    }
}
