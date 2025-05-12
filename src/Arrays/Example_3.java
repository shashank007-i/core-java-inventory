package Arrays;

import java.util.Scanner;

public class Example_3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[]nums={10,20,30,40,50,60};

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
           System.out.println(" ");
        for (int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+ " ");
        }
    }
}
