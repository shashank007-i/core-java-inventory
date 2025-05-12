package Arrays;

import java.util.Scanner;

public class Example_12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={10,20,30,40,50,60};
        int n=2;

        for (int i=0;i<n;i++){
            int first= arr[0];
            for (int j=0;j<arr.length-1;j++){
                 arr[j]=arr[j+1];

            }
            arr[arr.length-1]=first;
        }

          for ( int nums:arr){
              System.out.println(nums);
          }


    }

}
