package Bank_Menesment;

public class Account {
 private String customer_name;

  private String customer_id;

    private double balance;

    public Account(String name,String id,double balance)
    {
        this.customer_name=name;
        this.customer_id=id;
         this.balance=balance;

    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        balance-=amount;}

    public String getAccountInfo() {
        return "Name: " + customer_name + ", Account Number: " + customer_id + ", Balance: " + balance;
    }

}
