package iteration_loops;

import java.util.Scanner;

public class Example8
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x= sc.nextInt();
        int table;
        for (int i=1;i<=10;i++){
            table = x * i;
            System.out.println(table);
        }
    }
}
