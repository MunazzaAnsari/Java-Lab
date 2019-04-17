class Program  
{   public static void main(String[] args) {
        SavingAccount sa=new SavingAccount(1334,"munazza",2000,true);
        CurrentAccount ca=new CurrentAccount(56675, "munazza", 1000);
        RecurrentAccount ra = new RecurrentAccount(5667,"mghh",5000,15);

        sa.withdrawal(100);
        sa.withdrawal(100);
        sa.withdrawal(100);
        sa.withdrawal(100);
        sa.deposit(100);
        sa.deposit(100);
        sa.deposit(100);
        sa.deposit(100);
        ca.deposit(100);
        ca.withdrawal(1100);
        ra.withdrawal(100);
        ra.decreaseTenure(10);
        ra.withdrawal(100);

    }

}



