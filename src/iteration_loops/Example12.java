package iteration_loops;

import java.util.Scanner;

public class Example12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the age");
        int age = sc.nextInt();

        if (age > 0){
            System.out.println("valid input");
        } else if (age < 0) {
            System.out.println("invalid input");
        }
        if (age >= 18){
            System.out.println("you are 18 and older");
        }else if (age <= 18){
            System.out.println("you are younger");
        }

    }
}