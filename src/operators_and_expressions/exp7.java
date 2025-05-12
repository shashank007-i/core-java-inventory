package operators_and_expressions;

import java.util.Scanner;

public class exp7
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int length;int breadth;int heigth;
        System.out.println("enter the length of the cuboid");
        System.out.println("enter the breadth of the cuboid");
        System.out.println("enter the heigth of the cuboid");

        length= sc.nextInt();
        breadth= sc.nextInt();
        heigth= sc.nextInt();

        int volume=length*breadth*heigth;
        System.out.println(volume);

    }
}
