package Bank_Menesment;
import java.util.*;

public class Bank {

   private ArrayList<Account> accounts;
    public Bank(){
        accounts=new ArrayList<>();
    }
    public void add_account(Account account1){
       this.accounts.add(account1);

    }
    public void remove_acount(Account account)
    {
       this.accounts.remove(account);
    }
   public  void add_ammount(Account account,double amount)
   {
       account.deposit(amount);
   }
   public void remove_ammount(Account account,double amount)
   {
       account.withdraw(amount);
   }

   public ArrayList<Account> getAccounts()
   {
       return accounts;
   }


}

