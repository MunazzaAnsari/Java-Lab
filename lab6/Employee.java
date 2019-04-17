import java.util.Scanner;



class Employee {
    private int eid;
    private String ename;
    
    public Employee() {
        Scanner sc = new Scanner(System.in);
        
        eid = sc.nextInt();
        ename =  sc.next();
        System.out.println(+eid+","+ename);
    }   

    public Employee(int eid, String ename) {
        while(eid<9999 && eid>1000)
        {
        this.eid = eid;
        this.ename = ename;
        System.out.println(+this.id=)
    }


}