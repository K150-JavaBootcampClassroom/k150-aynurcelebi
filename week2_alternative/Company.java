package week2_alternative;

public class Company extends CustomerManager{
    public Company(String accountName,int password, String  email) {
        super(password,accountName,email);
        this.setAccountName(getAccountName());
        this.setPassword(getPassword());
    }
}
