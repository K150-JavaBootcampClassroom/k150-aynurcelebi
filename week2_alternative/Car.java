package week2_alternative;

public class Car {
    private int year;
    private String brand;
    private String color;
    private int horsePower;
    private int mounthPrice;
    private int dailyPrice;
    private double luggageCapacity;

    public Car() {
    }

    public Car(String brand, int year, String color, int luggageCapacity, int dailyPrice ) {
        this.brand = brand;
        this.year = year;
        this.setColor(color);
        this.luggageCapacity = luggageCapacity;
        this.dailyPrice = dailyPrice;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMounthPrice() {
        return mounthPrice;
    }

    public void setMounthPrice(int mounthPrice) {
        this.mounthPrice = mounthPrice;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public double getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}