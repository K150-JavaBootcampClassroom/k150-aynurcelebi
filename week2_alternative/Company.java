package week2_alternative;

public class Company extends CustomerManager{
    int id;
    public Company(String accountName,int password, String  email) {
        super(password,accountName,email);
        this.id =id;
        this.setAccountName(getAccountName());
        this.setPassword(getPassword());
    }
}
