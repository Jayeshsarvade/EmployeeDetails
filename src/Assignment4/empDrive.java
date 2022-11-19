package Assignment4;

public class empDrive {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id=1;
        e1.name = "jay";
        e1.sal = 10000;
        e1.CalculateSal();
        e1.DisplayEmpInfo();
    }
}
