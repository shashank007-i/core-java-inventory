package Arrays;

import java.util.Scanner;

//left rotation
public class Example_10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums[]={2,4,5,3,6,7};
        int n=2;
        for (int i=0;i<n;i++) {
            int first = nums[0];

            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[nums.length-1]=first;
        }

        System.out.println("after the left rotation");
        for (int num: nums){
            System.out.println(num);
        }


    }
}
