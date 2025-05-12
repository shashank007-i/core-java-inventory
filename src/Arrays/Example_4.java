package Arrays;

import java.util.Scanner;

public class Example_4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums[]={2,4,6,8,10};
        for (int i=0;i<nums.length;i++){
            nums[i]=nums[i]*2;
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }

}
