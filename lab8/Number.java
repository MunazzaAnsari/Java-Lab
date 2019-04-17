import java.util.*;
class Number
{
    public static void main(String[] args) {
        
    
    int no1;
    int no2;
    Scanner sc=new Scanner(System.in);
    no1=sc.nextInt();
    no2=sc.nextInt();
    try {
        System.out.println(no1/0);
        System.out.println( no2/0);

        }
     
    catch (Exception e){


    
        System.out.println(e);
    }
}  
}