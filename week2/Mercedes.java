package week2;

public class Mercedes extends CarManager{

    @Override
    public void setRentDay() {
        System.out.println("Sadece  günlük kiralanabilir");
    }

    @Override
    public void rentCalculate() {
        System.out.println("Kiralama Bedeli: "+rentPrice*10);
    }
}
