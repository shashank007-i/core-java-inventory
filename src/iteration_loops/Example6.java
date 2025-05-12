package iteration_loops;

import java.util.Scanner;

public class Example6
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        for (int i=n;i>=0;i--){
            System.out.println(i);
        }
    }
}
