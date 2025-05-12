package Section_10;

import java.util.Scanner;

public class Example2
{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number x:");
        int x= sc.nextInt();
        if (x % 2 == 0){
            System.out.println("s2p");
        }else {
            System.out.println("java");
        }
    }
}
