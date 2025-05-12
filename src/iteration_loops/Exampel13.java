package iteration_loops;

import java.util.Scanner;

public class Exampel13
{//powers n output//
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x= sc.nextInt();
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        int result = 1;
        for (int i=1 ;i <= n;i++){
            result *= x;
        }
        System.out.println("The output is:"+result);
    }
}
