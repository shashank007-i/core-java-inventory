package iteration_loops;

import java.util.Scanner;

public class Example5
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        int count;
        for (int i=0;i<=n;i++){
            System.out.println( i );
        }
        System.out.println(" ");
    }
}
