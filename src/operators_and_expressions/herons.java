package operators_and_expressions;

import java.util.Scanner;

public class herons
{
    public static void main(String args[]){
        float a,b,c,s,area;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the side a");
         a= sc.nextFloat();
        System.out.println("enter the side b");
        b= sc.nextFloat();
        System.out.println("enter the side c");
        c= sc.nextFloat();
        s = (a + b + c)/2f;
        area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println(area);


    }
}
