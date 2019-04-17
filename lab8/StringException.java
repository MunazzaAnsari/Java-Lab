import java.util.*;
class StringException{
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc =new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        try{
            System.out.println(s1.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}