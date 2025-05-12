package Arrays;

import java.util.Scanner;

public class Example_7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums[]={12,45,7,89,23,56};
        int maxnum=Integer.MAX_VALUE;

        for (int i=0;i<nums.length;i++){
            if (maxnum > nums[i]){
               maxnum=nums[i];
            }

        }
        System.out.println("maximum number in this array is"+maxnum);

    }
}
