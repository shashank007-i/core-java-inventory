package iteration_loops;

import java.util.Scanner;

public class example7
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int num= sc.nextInt();
        for (int i=2;i<=num;i+=2){
           System.out.println(i + " ");

        }

    }
}
