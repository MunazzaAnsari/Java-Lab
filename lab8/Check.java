import java.util.Scanner;

class Check
{
    int n1, n2;

    public static void cal() {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        add( n1, n2);
    }

    public static void add(int n1, int n2) {
        int add = n1/n2;
        System.out.println(add);

    }

    public static void main(String[] args) {
        cal();

    }
}