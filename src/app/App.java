package app;

import app.models.Car;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.color = "White";
        car1.quantity = 1;
        System.out.println(car1.myHashCode());


        Car car2 = new Car();
        car2.name = "Toyota";
        car2.color = "White";
        car2.quantity = 1;
        System.out.println(car2.myHashCode());

        Car car3 = new Car();
        car3.name = "Audi";
        car3.color = "Black";
        car3.quantity = 3;
        System.out.println(car3.myHashCode());

        System.out.println(car2.myEquals(car1));

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println(cars);
        System.out.println(cars.size());
    }
}
