package Arrays;

import java.util.Scanner;

public class Example_6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size;
        int nums[]=null;

        System.out.println("enter the size of the array");
        size= sc.nextInt();

        //array banao
        nums= new int[size];

        for (int i=0;i<size;i++){
            System.out.println("enter the elements:");
            nums[i]= sc.nextInt();
        }

        int searchelements;
        System.out.println("enter the element you want to find:");
        searchelements= sc.nextInt();

        int foundindex = -1;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == searchelements) {
                foundindex = i;
            }
        }

            if (foundindex != -1){
                System.out.println("element found at"+foundindex);

            }
            else {
                System.out.println("element not found..");
            }

        }
    }

