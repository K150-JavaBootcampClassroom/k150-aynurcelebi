package week2;

public class Main {
    public static void main(String[] args){

        Mercedes mercedes = new Mercedes();
        mercedes.setRentDay();
        Citizen citizen = new Citizen();
        citizen.rent();
        Company company = new Company();
        company.rent();

    }
}
