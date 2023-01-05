package week2_alternative;

public class Car {

    private String model;
    private int year;
    private String brand;
    private int horsePower;
    private int price;

    public Car(String model, int year, String brand, int horsePower, int price){

        this.setModel(model);
        this.setBrand(brand);
        this.setYear(year);
        this.setHorsePower(horsePower);
        this.setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

