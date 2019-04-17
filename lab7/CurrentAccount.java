class CurrentAccount extends Account{
    CurrentAccount(int accno,String name,double balance)
    {
        super(accno,name);
         type="Current";
         if(balance<1000)
         {
             balance=1000;
         }
         else{
             this.balance=balance;

         }

    }

}