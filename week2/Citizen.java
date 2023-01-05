package week2;

// Sadece Audi kiralanabilir..
public class Citizen extends CustomerManager{

    @Override
    public void rent() {
        System.out.println("Sadece Audi kiralanabilir.");
    }
}
