package iteration_loops;

import java.util.Scanner;

public class example1
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number= sc.nextInt();

        int count=0;
        int x=number;
        while(count<=x){
            count++;

            System.out.println(count);
        }
    }
}
