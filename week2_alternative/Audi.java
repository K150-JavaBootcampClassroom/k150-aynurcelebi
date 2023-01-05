package week2_alternative;

public class Audi extends Car implements IRent{
    public Audi(){

    }
    public Audi(String brand,int year, String color,int luggageCapacity, int dailyPrice){
        super(brand, year, color, luggageCapacity, dailyPrice);
    }


    @Override
    public void rentCalculator() {
        System.out.println("Günlük olarak kiralanabilir");
    }
}
