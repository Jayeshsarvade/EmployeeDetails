package Assignment7;

import java.util.Scanner;
public class Address {
    private String city;
    private String state;

    Scanner sc=new Scanner(System.in);

    public void readAdd()
    {
        System.out.println("Enter city name :");
        city=sc.next();

        System.out.println("Enter state name :");
        state=sc.next();
    }

    public void dispAdd()
    {
        System.out.println("City is :"+city);
        System.out.println("State is :"+state);
    }
}

