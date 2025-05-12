package operators_and_expressions;

import java.util.Scanner;

public class example6
{
    public static void main(String args[]){
        int a;
        int b;
        int c;
        int delta;
        float root1;
        float root2;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the values of a ,b, c");

        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        root1=(float) (-b + Math.sqrt((b*b) - 4*a*c))/(2*a);
        root2 = (float) (b  + Math.sqrt((b*b) - 4*a*c)) / (2*a);

          System.out.println("root 1:"+root1);
          System.out.println("root 2:"+root2);
    }
}
