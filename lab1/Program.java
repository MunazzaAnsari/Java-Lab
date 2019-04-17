class Program
{
    public static void main(String[] args) {
        Account acc=new Account();
        acc.accno=1234;
        acc.holdername="munazza";
        acc.balance=200000;
        acc.type="saving";
        System.out.println("account no="+acc.accno);
        System.out.println("account holder="+acc.holdername);
        System.out.println("account balace="+acc.balance);
        System.out.println("account type="+acc.type);
    } 
}