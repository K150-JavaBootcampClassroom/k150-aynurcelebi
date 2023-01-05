package week2_alternative;

public class CustomerManager {
    private String accountName;
    private int password;
    private String  email;
    private String city;

    public CustomerManager(int password, String accountName, String email) {
        this.accountName = accountName;
        this.city= city;
        this.email=email;
        this.password=password;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        accountName = accountName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
