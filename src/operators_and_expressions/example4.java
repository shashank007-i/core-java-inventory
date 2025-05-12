package operators_and_expressions;

import java.util.Scanner;

public class example4
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float lfbase;
        float lfheight;
        System.out.println("enter the base of the triangle");
        lfbase= sc.nextFloat();
        System.out.println("enter the height of the triangle");
        lfheight= sc.nextFloat();

        float lfarea= (lfbase * lfheight)/2;
        System.out.println("area of the triangle is:" + lfarea);


    }
}
