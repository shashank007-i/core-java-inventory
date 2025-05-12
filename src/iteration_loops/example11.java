package iteration_loops;

import java.util.Scanner;

public class example11
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number= sc.nextInt();
        int reversed=0;
        for (;number != 0 ; number/=10){



            int digit = number % 10;
            reversed= reversed * 10 + digit;
            System.out.println(reversed);

        }
    }
}
