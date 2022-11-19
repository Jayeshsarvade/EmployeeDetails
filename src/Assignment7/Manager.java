package Assignment7;


public class Manager extends  Empp {

    private int numOfEmployee;

    Address ad1=new Address();
    Programmer p1=new Programmer();

    public void readMgr()
    {
        readEmployee();
        System.out.println("Enter no of employee :");
        numOfEmployee=sc.nextInt();
        ad1.readAdd();
        p1.addName();
    }

    public void displayMgr()
    {
        displayEmployee();
        System.out.println("Numbers of employee :"+numOfEmployee);
        ad1.dispAdd();
        p1.displayname();
    }
}
