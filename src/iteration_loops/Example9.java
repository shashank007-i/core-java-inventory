package iteration_loops;

import java.util.Scanner;

public class Example9
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
