package quarkus;

import java.math.BigDecimal;

public class Account {

    public Long accountNumber;
    public Long customerNumber;
    public String customerName;
    public BigDecimal balance;
    public AccountStatus accountStatus = AccountStatus.OPEN;

    public Account(){}

    public Account(Long accountNumber, Long customerNumber, String customerName, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.balance = balance;
    }


    public void markOverdrawn(){
        accountStatus = AccountStatus.OVERDRAWN;
    }

    public void removeOverdrawnStatus(){
        accountStatus = AccountStatus.OPEN;
    }

    public void close(){
        accountStatus = AccountStatus.CLOSED;
        balance = BigDecimal.valueOf(0);
    }

    public void withdrawFunds(BigDecimal amount){
        balance = balance.subtract(amount);
    }

    public void addFunds(BigDecimal amount){
        balance = balance.add(amount);
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }
}
