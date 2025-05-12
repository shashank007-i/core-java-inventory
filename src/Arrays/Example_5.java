package Arrays;

import java.util.Scanner;

public class Example_5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums[]={5,10,15,20,25};
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println("sum of all elements is:"+sum);
    }
}
