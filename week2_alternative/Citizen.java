package week2_alternative;

public class Citizen extends CustomerManager {
    public Citizen(String accountName,int password, String  email) {
        super(password,accountName,email);
        this.setAccountName(getAccountName());
        this.setPassword(getPassword());
    }
}
