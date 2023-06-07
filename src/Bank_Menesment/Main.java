package Bank_Menesment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner n=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);




           int N= n.nextInt();

        for (int i = 0; i < N; i++) {
            String name=s1.nextLine();
            String id= s2.nextLine();
            double balance=s3.nextDouble();
            Account account1=new Account(name,id,balance);
            bank.add_account(account1);
        }

        ArrayList<Account> accounts=new Bank().getAccounts();

        for(Account account: accounts)
        {
            System.out.println(account.getAccountInfo());
        }
    }
}
