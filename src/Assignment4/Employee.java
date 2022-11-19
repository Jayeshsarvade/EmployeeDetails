package Assignment4;
public class Employee {
    int id;
    String name;
    float sal;
    void CalculateSal() {
       // float salary = 0;
        float hra;
        float da;
        float pf;

        hra = sal * 0.1f;
        da = sal * 0.05f;
        pf = sal * 0.07f;
        sal=sal+hra+da-pf;
    }
    void DisplayEmpInfo() {
        System.out.println("name is: " + name);
        System.out.println("id is: " + id);
        System.out.println("sal is: " + sal);

    }

}
