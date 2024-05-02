import java.util.Arraylist;
import java.util.scanner;

class Employee {
    protected string empno;
    protected string ename;
    protected double sal;
    protected double hra;
    protected double da;
    protected int allowed_leaves;
    protected int leaves_taken;
    protected double other_allowance;

    public Employee(string empno,string ename,double sal,double hra,double da,int allowed_leaves,int leaves_taken,double other_allowance) {
        this.empno= empno;
        this.ename= ename;
        this.sal =sal;
        this.hra =da;
        this.da =da;
        this.allowed_leaves =allowed_leaves;
        this.leaves_taken =leaves_taken;
        this.other_allowance =other_allowance;

    }

    public void calculate_sal() {
        this.sal =this.sal+( this.sal * this.hra/100) +(this.sal *this.da/100) + this.other_allowance;
    }

    public void printsalary() {
        system.out.println("Employee number:" + this.empno);
        system.out.println("Employee name:" + this.ename);
        system.out.println("Salary:" + this.sal);
        system.out.println("leaves taken:" +this.leaves_taken);
    }

    public void save() {
        //save to database or file
    }
}

class permanentEmp extands Employee{
    public permanentEmp (string empno,string ename,double sal,double hra,double da,int allowed_leaves,int leaves_taken,double other_allowance) {
        super (empno,ename,sal,hra,da,allowed_leaves,leaves_taken,other_allowance);
    }

    @Override
    public void save() {
        //save to database or file
    }
}

class contractEmp extands Employee {
    public contractEmp(string empno,string ename,double sal,double da,int allowed_leaves,int leaves_taken,double other_allowance) {
          super(empno,ename,sal,hra,da,allowed_leaves,leaves_taken,other_allowance);

   }

   @Override
   public void save(){
    //save to datase or file
   }


}

public class main6 {
    run |Debug
    public static void main(string[] args) {
        Scanner ScannER =new scanner(system.in);
        Arraylist<Employee> employees =new Arraylist<>();

        system.out.print(s:"Enter the number of employees:");
        int numEmployees =Scanner.Scanner.nextInt();
        Scanner.nextLine(); //Consume newline character

        for (int i=0; i < numEmployees;i++) {
            system.out.println("Employee" +(i+1) + ":");
            System.out.print (s:"Employee number:");
            String empno=Scanner.nextLine();
            System.out.print(s:"Employee Name:");
            String ename=Scanner.nextLine();
            System.out.print(s:"salary:");
            double sal =Scanner.nextdouble();
            System.out.print(s:"HRA (%):");
            double hra=Scanner.nextdouble();
            System.out.print(s:"da (%):");
            double da=Scanner.nextdouble();
            System.out.print(s:"Allowed leaves:");
            int allowedleaves= Scanner.nextLine();
            System.out.print(s:"leaves taken:");
        
        
}
