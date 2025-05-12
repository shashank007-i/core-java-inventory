package Section_10;

import java.util.Scanner;

public class example4
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();
        if (age > 0 && age< 100){
        }else{
            System.out.println("please go home");
        }
        if (age > 15 && age < 30){
            System.out.println("you can ride roller coaster");

        }else {
            System.out.println("you can tAKE taxi games");
        }
    }
    }

