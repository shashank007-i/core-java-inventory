package Arrays;

import java.util.Scanner;

public class Example_11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums[]={2,3,4,5,6,8};
        int n=2;
        for (int i=0 ; i<n;i++){
            int last=nums[nums.length-1];
            for (int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=last;
        }
        for (int num:nums){
            System.out.println(num);
        }



    }

}
