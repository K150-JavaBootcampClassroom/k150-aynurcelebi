package week2_alternative;

public class Mercedes extends Car implements IRent {
    public Mercedes(String brand,int year, String color,int luggageCapacity, int dailyPrice){
        super(brand, year, color, luggageCapacity, dailyPrice);
    }

    @Override
    public void rentCalculator() {
        System.out.println("Aylık olarak kiralanabilir.");
    }
}
