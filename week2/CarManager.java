package week2;

public abstract class CarManager {

    double luggageCapacity; //Bagaj kapasitesi
    int rentPrice;          //Kiralama Bedeli
    String color;           //Renk
    int horsePower;         //Beygir Gücü

    public abstract void setRentDay();
    public abstract void rentCalculate();

}
