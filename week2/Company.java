package week2;

// Audi,Mercedes ve BMW kiralanabilir..
public class Company extends CustomerManager{

    @Override
    public void rent() {
        System.out.println("Bütün araçlar kiralanabilir..");
    }
}
