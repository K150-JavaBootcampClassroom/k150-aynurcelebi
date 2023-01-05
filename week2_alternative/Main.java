package week2_alternative;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(1, "Ali", "a.gmail.com");
        customerManager.getAccountName();
        Audi audi = new Audi();
        audi.rentCalculator();

    }
}
