package methods_functions;

public class Example9
{

    static void recarea1(double length1,double width1){
        double area1=length1 * width1;
        System.out.println("Length:" + length1);
        System.out.println("width:"+width1);
        System.out.println("area:"+area1);
        System.out.println("-----------------------");

        return;
    }
    static void recarea2(double length2,double width2){
        double area2=length2 * width2;
        System.out.println("Length:" + length2);
        System.out.println("width:"+width2);
        System.out.println("area:"+area2);
        System.out.println("-----------------------------");
        return;
    }
    static void recarea3(double length3,double width3){
        double area3=length3 * width3;
        System.out.println("Length:" + length3);
        System.out.println("width:"+width3);
        System.out.println("area:"+area3);
        System.out.println("----------------------------");
        return;
    }
    static void recarea4(double length4,double width4){
        double area4=length4 * width4;
        System.out.println("Length:" + length4);
        System.out.println("width:"+width4);
        System.out.println("area:"+area4);
        System.out.println("--------------------------------");
        return;
    }
    static void recarea5(double length5,double width5){
        double area5=length5 * width5;
        System.out.println("Length:" + length5);
        System.out.println("width:"+width5);
        System.out.println("area:"+area5);
        System.out.println("------------------------------");
        return;
    }

    public static void main(String args[]){
        recarea1(2,4);
        recarea2(3,7);
        recarea3(4,7);
        recarea4(3,8);
        recarea5(2,8);
    }
}
