package datatypes_variables;

import java.util.Scanner;

public class float_double
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float lfCGPA;
        double ldcollegefees;

        System.out.print("enter your CGPA:");
        lfCGPA= sc.nextFloat();

        System.out.print("enter your college fess:");
        ldcollegefees= sc.nextDouble();

        System.out.println("impressive your CGPA is:"+lfCGPA);
        System.out.print("and your college fees is:"+ldcollegefees);




    }
}
