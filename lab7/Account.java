
class Account {
 
  protected int accno;
  protected String name;
  protected String type;
  protected double balance;
  protected double amt;
  Account(int accno,String name ) 
  {
    
      this.accno=accno;
      this.name=name;
  } 
  protected void deposit(double amt)
  {
    if(amt<0)
      balance=balance+amt;
      System.out.println(" deposite successfull balance="+balance);

  }
  protected void withdrawal(double amt) {
    if(amt<0)
    if (balance-amt>0){
      balance=balance-amt;
        System.out.println("balance=" + balance);
    }
    else{
      System.out.println("CANNOT WITHDRAW INSUFFICIENT BALANCE");
    }   


      
  }
}
