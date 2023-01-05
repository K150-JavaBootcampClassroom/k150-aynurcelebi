package week2;

public class Audi extends CarManager{
    @Override
    public void setRentDay() {
        System.out.println("Aylık kiralanabilir..");

    }

    @Override
    public void rentCalculate() {
        System.out.println("Kiralama Bedeli: "+rentPrice*10*30);
    }
}
