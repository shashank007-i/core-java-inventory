package Arrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Example_2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of the array");
     int size= sc.nextInt();


     int[]arr=new int[size];
     int sum=0;
     System.out.println("enter "+size+"elements");
     for (int i=0;i<size;i++){
        arr[i]= sc.nextInt();
        sum+=arr[i];
     }
     System.out.println("sum of array elements:"+sum);




    }
}