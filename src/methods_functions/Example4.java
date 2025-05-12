package methods_functions;

public class Example4
{
    static void performaddition(int x,int y){
        System.out.println("addition");
        int addresult= x + y;
        System.out.println(addresult);
        System.out.println("-----------------");
        return;
    }
    static void performsubtraction(int x, int y){
        System.out.println("subtraction");
        int subtraction=x - y;
        int result=x- y;
        System.out.println(result);
        System.out.println("-------------------------");
        return;
    }
    static void performmultiplication(int x , int y){
        System.out.println("multiplication");
        int multiplication= x * y;
        int result= x * y;
        System.out.println(result);
        System.out.println("-------------------------");
        return;
    }
    static void performdivision( double x ,double  y){
        System.out.println("division");
        double division=x / y;
        System.out.println("result:"+division);
        System.out.println("------------------------------");
        return;
    }
    static void performmodulus(int x,int y){
        System.out.println("modulus");
        int modulus= x % y;
        System.out.println(modulus);
        System.out.println("-----------------------");
        return;
    }
    static void performpower(double x,double y){
        System.out.println("power");
        double powerresult = Math.pow(x, y);
        System.out.println(powerresult);
        System.out.println("-----------------------");
        return;
    }
    static void performsquareroot(double x){
        System.out.println("square root");
        double sqrtResult = Math.sqrt(x);
        System.out.println(sqrtResult);
        System.out.println("------------------------");
        return;
    }

    public static void main(String args[]){
        performaddition(2,3);
        performsubtraction(5,4);
        performmultiplication(3,3);
        performpower(2,5);
        performsquareroot(25);
    }


    }





