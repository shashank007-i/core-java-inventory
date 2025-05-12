package Arrays;

import java.util.Scanner;

public class Example_14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size= sc.nextInt();

        int[]arr=new int[size];
         int sum=0;
        for (int i=0;i<arr.length;i++) {
            System.out.println("enter the elements");
            int elements = sc.nextInt();
            sum += arr[i];
        }

            double average =(double) sum / size;

        System.out.println("The average of the array elements is"+average);

    }
}
