package ru.nsu.sidey383.slove;

import ru.nsu.sidey383.problem.Car;

public interface CarBuilder {

    CarBuilder setPrice(int price);

    CarBuilder setNumber(String number);

    CarBuilder setMileage(int mileage);

    CarBuilder setModelAndBrand(String brand, String model);

    CarBuilder setYear(int year);

    CarBuilder setCity(String city);

    CarBuilder setEngineCapacity(double engineCapacity);

//    CarBuilder setOwner(String owner);

    Car build();

}
