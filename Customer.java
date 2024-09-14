import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Customer {

    @Id
    private String phoneNumber;

    @Column(nullable = false)
    private String pin;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double balance;

    public Customer() {}

    public Customer(String phoneNumber, String pin, String name, double balance) {
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    // Getters and Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
