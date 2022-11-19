package Assignment7;
import java.util.*;
public class Programmer extends Empp{
    private String projectName;

    Scanner sc=new Scanner(System.in);
    public void addName()
    {
        System.out.println("Enter project name :");
        projectName=sc.next();

    }

    public void displayname()
    {
        System.out.println("Project Name :"+projectName);
    }
}
