class RecurrentAccount extends Account{
    int tenure;
    RecurrentAccount(int accno,String name,double balance,int ten)
    {
        super(accno,name);
        if (balance<5000)
           balance=5000;
        else
            balance = balance;
        type="Recurrent";
        if (ten<10)
           tenure=10;
        else
           tenure= ten;
           balance=0;


    } 
    
    public void withdrawl(double amt) {
        if (tenure > 0 || amt < 0 || balance - amt < balance || amt % 100 != 0) {
            System.out.println("Error");
            return;
        }
        balance = balance - amt;
        System.out.println("new balance is " + balance);
    }

    public void deposit(double amt) {
        if (amt < 0 || amt % 100 != 0) {
            System.out.println("Error");
            return;
        }
        balance = balance + amt;
        System.out.println("New balance is " + balance);
    }

    public void decreaseTenure(int t){
        if (tenure<0){
            System.out.println("tenure over");
        }
        if(t<0)
            System.out.println("error");
        else
            tenure = tenure-t;
            System.out.println("New tenure is "+tenure+" years");
    }
}