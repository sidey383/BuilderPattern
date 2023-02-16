package ru.nsu.sidey383.slove;

import ru.nsu.sidey383.problem.Car;

public class UsedCarBuilder implements CarBuilder {

    private int price = 0;

    private int mileage = 0;
    private String number = "X000XX";
    private String model;
    private String brand;
    private int year = 2023;
    private String city = "Novosibirsk";
    private double engineCapacity = 2.0;
    private Car.Transmission transmission = Car.Transmission.AUTOMATIC;


    @Override
    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }
    @Override
    public CarBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public CarBuilder setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    @Override
    public CarBuilder setModelAndBrand(String brand, String model) {
        this.model = model;
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public CarBuilder setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

//    private String owner = null;
//    public CarBuilder setOwner(String owner) {
//        this.owner = owner;
//        return this;
//    }

    @Override
    public Car build() {
        return new Car(price, mileage, number, model, brand, year, city, engineCapacity, transmission);
//        return new Car(price, mileage, number, model, brand, year, city, engineCapacity, transmission, owner);
    }
}
