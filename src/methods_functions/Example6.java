package methods_functions;

import java.awt.desktop.SystemSleepEvent;

public class Example6
{
    static void table2(int x){
        System.out.println("table of 2");
       for (int i =0;i<=10;i++){
           System.out.println("2 x " + i + " = " + (x * i));
       }
        System.out.println("-------------------------");
    }

    static void table3(int x){
        System.out.println("table of 3");
        for (int i =0;i<=10;i++){
            System.out.println("3 x " + i + " = " + (x * i));
        }
        System.out.println("-------------------------");
    }
    static void table4(int x){
        System.out.println("table of 4");
        for (int i =0;i<=10;i++){
            System.out.println("4 x " + i + " = " + (x * i));
        }
        System.out.println("-------------------------");
    }

    static void table5(int x){
        System.out.println("table of 5");
        for (int i =0;i<=10;i++){
            System.out.println("5 x " + i + " = " + (x * i));
        }
        System.out.println("-------------------------");
    }
    static void table6(int x){
        System.out.println("table of 6");
        for (int i =0;i<=10;i++){
            System.out.println("6 x " + i + " = " + (x * i));
        }
        System.out.println("-------------------------");
    }

    public static void main(String args[]){

        table2(2);
        table3(3);
        table4(4);
        table5(5);
        table6(6);


    }




}
