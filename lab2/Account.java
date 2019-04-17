import java.util.*;

class Account
{
    Scanner sc = new Scanner(System.in);
    int accno;
    String holdername;
    double balance;
    String type;

    public void accept()
    {
        accno = sc.nextInt();
        holdername = sc.next();
        balance = sc.nextDouble();
        type=sc.next();
    }

    public void display()
    {
        System.out.println("account no"+accno + "holdername"+holdername + "balance"+balance +"type"+type);
    }
}
