package Arrays;

import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {10, 25, 36, 78, 45, 89, 56};
        int firstmax = nums[0];
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstmax) {
                secondmax = firstmax;
                firstmax = nums[i];

            } else if (nums[i]>secondmax)
            {
                secondmax=nums[i];
            }
        }
        System.out.println("second maximum number is"+secondmax);
    }
}