package iteration_loops;

import java.util.Scanner;

public class example2
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value x");
        int x= sc.nextInt();

        int sum=0;

        while(x != 0){
            sum++;
            x = x / 10;
        }
        System.out.println(sum);
    }
}
