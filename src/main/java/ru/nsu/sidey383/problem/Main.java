package ru.nsu.sidey383.problem;

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
     * Создаем объект {@link Car} с помощью конструктора.
     * Очень много параметров. Сложно понять какой конструктор используются и какие параметры были переданы.
     * Для использования параметров по умолчанию нужно создавать много новых конструкторов.
     * <p>
     * Вывод: создание объектов может стать сложной самостоятельной операцией. Её можно вынести в отдельный класс.
     * <p>
     * Паттерн Builder решает данную проблему. {@link ru.nsu.sidey383.slove.Main}
     * **/
    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(3_000_000,  "Tucson", "Hyundai", 2022, "Novosibirsk", 2.0, Car.Transmission.AUTOMATIC));
        cars.add(new Car(675_000, 345_345, "BK652A", "3-Series", "BMW", 2010, "Novosibirsk", 2.0, Car.Transmission.AUTOMATIC));
        cars.add(new Car(675_000, 523_522, "AX232B", "3-Series", "BMW", 2006, "Moscow", 2.0, Car.Transmission.AUTOMATIC));
        return cars;
    }

}
