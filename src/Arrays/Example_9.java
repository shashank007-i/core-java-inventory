package Arrays;

import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int nums[] = null;

        System.out.println("enter the size of the array");
        size = sc.nextInt();

        nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the array elements");
            nums[i] = sc.nextInt();
        }
            int searchelement;
            System.out.println("enter the element to find in the array");
            searchelement = sc.nextInt();

            int foundindex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == searchelement) {
                    foundindex = i;
                }
            }
            if (foundindex != -1) {
                System.out.println("element found at index" + foundindex);
            } else {
                System.out.println("element not found....");
            }
        }
    }


