import java.util.Scanner;

public class CarTester{
    public static Car addCar(){
        Scanner carScan = new Scanner(System.in);
        System.out.println("Enter a car name: ");
        String carName = carScan.nextLine();
        System.out.println("Enter miles driven: ");
        double mileDriven = carScan.nextDouble();
        System.out.println("Enter gallons used: ");
        double gallonsUsed = carScan.nextDouble();
        Car car1 = new Car(carName,mileDriven,gallonsUsed);
        return car1;
    }
    
    public static void main(String[] args){
        Car car1 = addCar();
        Car car2 = addCar();
        System.out.println(car1);
        System.out.println(car2);
    }
}

