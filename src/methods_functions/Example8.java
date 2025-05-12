package methods_functions;

public class Example8 {
    static void factorialnum1(int x) {
        int result1 = 1;

        for (int i = 1; i <= x; i++) {
            result1 *= i;
        }
        System.out.println("Factorial of " + x + " is: " + result1);
        System.out.println("-----------------------");
        return;
    }

    static void factorialnum2(int x) {
        int result2 = 1;

        for (int i = 1; i <= x; i++) {
            result2 *= i;
        }
        System.out.println("Factorial of " + x + " is: " + result2);
        System.out.println("-----------------------");
        return;
    }

    static void factorialnum3(int x) {
        int result3 = 1;

        for (int i = 1; i <= x; i++) {
            result3 *= i;
        }
        System.out.println("Factorial of " + x + " is: " + result3);
        System.out.println("-----------------------");
        return;
    }

    static void factorialnum4(int x) {
        int result4 = 1;

        for (int i = 1; i <= x; i++) {
            result4 *= i;
        }
        System.out.println("Factorial of " + x + " is: " + result4);
        System.out.println("-----------------------");
         return;

    }

    public static void main(String args[]){
        factorialnum1(3);
        factorialnum2(4);
        factorialnum3(5);
        factorialnum4(6);


    }
}



