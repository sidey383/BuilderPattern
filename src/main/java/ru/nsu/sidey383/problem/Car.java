package ru.nsu.sidey383.problem;

public class Car {

    private final int price;
    private final int mileage;
    private final String number;
    private final String model;
    private final String brand;
    private final int year;
    private final String city;
    private final double engineCapacity;
    private final Transmission transmission;

    // Также можно легко добавиь новые поля не переписывая пользовательский код.
    // Код использующий объект стал меньше зависеть от способа создания объекта.

//    private final String owner;
//    public Car(int price, int mileage, String number, String model, String brand, int year, String city, double engineCapacity, Transmission transmission, String owner) {
//        this.price = price;
//        this.mileage = mileage;
//        this.number = number;
//        this.model = model;
//        this.brand = brand;
//        this.year = year;
//        this.city = city;
//        this.engineCapacity = engineCapacity;
//        this.transmission = transmission;
//        this.owner = owner;
//    }
//
//    public String getOwner() {
//        return owner;
//    }

    /**
     * Большой страшный конструктор
     * ***/
    public Car(int price, int mileage, String number, String model, String brand, int year, String city, double engineCapacity, Transmission transmission) {
        this.price = price;
        this.mileage = mileage;
        this.number = number;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.city = city;
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
//        this.owner = null;
    }

    /**
     * Второй большой страшный конструктор
     * ***/
    public Car(int price, String model, String brand, int year, String city, double engineCapacity, Transmission transmission) {
        this.price = price;
        this.mileage = 0;
        this.number = null;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.city = city;
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
//        this.owner = null;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public boolean isCorrect() {
        return price >= 0 &&
                mileage >= 0 &&
                ( number == null || number.length() == 6 ) &&
                model != null &&
                brand != null &&
                city != null &&
                year >= 1800 &&
                engineCapacity > 0 &&
                transmission != null;
    }

    public String getName() {
        return brand +
                " " +
                model +
                ", " +
                year +
                (mileage == 0 ? " new!" : " used");
    }

    public enum Transmission {
        AUTOMATIC, MECHANIC
    }

}
