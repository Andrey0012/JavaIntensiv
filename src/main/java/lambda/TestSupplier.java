package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestSupplier {
    protected static ArrayList<Car> carArrayList (Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        arrayList.add(carSupplier.get());
        }
        return arrayList;
    }
   public static void changeCar (Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
   }

    public static void main(String[] args) {
        ArrayList<Car> cars = carArrayList(() -> new Car("dbhnbd", "dfhbd", 2.5));
        System.out.println(cars);
        changeCar(cars.get(0),car -> {
            car.color="ddddd";
            car.engine =3.5;
            System.out.println(car);
        } );
        System.out.println(cars);
    }
}
class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "lambda.Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}