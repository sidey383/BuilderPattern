package ru.nsu.sidey383.slove;

import ru.nsu.sidey383.problem.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = getCars();
        for (Car car : cars) {
            System.out.println(car.getName());
        }
    }

    /**
     * Объекты создаются понятным образом. Можно опускать некоторые инициализации.
     * Также, больше не нужно знать значения по умолчанию для создания соответствующего класса.
     * <p>
     * Больше примеров использования Builder {@link ru.nsu.sidey383.examples.Main}
     * **/
    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        CarBuilder builder = new NewCarBuilder()
                    .setModelAndBrand("Tucson", "Hyundai")
                    .setNumber("AX232B")
                    .setEngineCapacity(2.3)
                    .setPrice(200_000);
        cars.add(builder.build());
        cars.add(builder.build());
        cars.add(
                new UsedCarBuilder()
                        .setNumber("AX232B")
                        .setMileage(523_522)
                        .setPrice(675_000)
                        .setModelAndBrand("Tucson", "Hyundai")
                        .setEngineCapacity(2.3)
                        .setYear(2006).build()
        );
        return cars;
    }
}
