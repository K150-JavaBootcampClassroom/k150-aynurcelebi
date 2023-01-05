package week2;

public class BMW extends CarManager{
    @Override
    public void setRentDay() {
        System.out.println("Günlük kiralanabilir");
    }

    @Override
    public void rentCalculate() {
        System.out.println("Kiralama Bedeli: "+rentPrice*15);
    }
}
