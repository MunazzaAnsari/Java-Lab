
class SavingAccount extends Account
{
    boolean premium;
    int count=1;
    int dcount=1;
    SavingAccount(int accno,String name,double balance,boolean avail)
    {
        super(accno ,name);
        if(balance<1000)
        {
            balance=1000;
        }
        else{
         this.balance=balance;
         System.out.println("Account balance="+this.balance);

        }
        type="Saving";
        premium=avail;
    }
    protected void withdrawal(double amt) {
        if(count>3 || balance - amt <1000)
        {
            balance=balance-amt;
            System.out.println(" new account balance="+balance);
            System.out.println("SORRY YOU CANNOT WITHDRAW....");
        }
        else{
             System.out.println("WITHDRAW \n");
             balance=balance-amt;
            System.out.println("new account balance="+balance);
            count++;
        } 
    }         
    protected void deposit(double amt) {
        if(dcount>3)
        {
            System.out.println("SORRY YOU CANNOT DEPOSIT");
        }
        else{
            System.out.print("DEPOSIT \n");
            balance=balance+amt;
            System.out.println("new account balance="+balance);
            dcount++;
        }
    }   
    
}
