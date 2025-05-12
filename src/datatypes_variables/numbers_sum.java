package datatypes_variables;

import java.awt.*;
import java.util.Scanner;

public class numbers_sum
{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("enter number - 1:");
        a= sc.nextInt();

        System.out.println("enter number - 2:");
        b= sc.nextInt();

        c = a + b;
        System.out.print(c);


    }
}
