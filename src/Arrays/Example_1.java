package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example_1
{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("enter the size of array");
          int size= sc.nextInt();


          int[]arr=new int[size];

          System.out.println("enter"+size+"elements");
          for (int i=0;i<size;i++){
              arr[i]=sc.nextInt();
          }

          Arrays.sort(arr);

          System.out.println("sorted array is");
         for (int num:arr){
             System.out.println(num+" ");
         }


    }


}
