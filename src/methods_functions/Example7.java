package methods_functions;

public class Example7
{
    static void revnum1(int num1){
        int number1 = num1;
        int reversed1 = 0;
        int original1 = number1;
        while (number1 != 0) {
            int digit = number1 % 10;
            reversed1 = reversed1 * 10 + digit;
            number1 /= 10;
        }
        System.out.println("Original: " + original1 + ", Reversed: " + reversed1);

        System.out.println("-----------------------------");
    }
    static void revnum2(int num2){
        int number2 = num2;
        int reversed2 = 0;
        int original2 = number2;
        while (number2 != 0) {
            int digit = number2 % 10;
            reversed2 = reversed2 * 10 + digit;
            number2 /= 10;
        }
        System.out.println("Original: " + original2 + ", Reversed: " + reversed2);

        System.out.println("-----------------------------");
    }
    static void revnum3(int num3){
        int number3 = num3;
        int reversed3 = 0;
        int original3 = number3;
        while (number3 != 0) {
            int digit = number3 % 10;
            reversed3 = reversed3 * 10 + digit;
            number3 /= 10;
        }
        System.out.println("Original: " + original3 + ", Reversed: " + reversed3);

        System.out.println("-----------------------------");
    }
    static void revnum4(int num4)

    {
        int number4 = num4;
        int reversed4 = 0;
        int original4 = number4;
        while (number4 != 0) {
            int digit = number4 % 10;
            reversed4 = reversed4 * 10 + digit;
            number4 /= 10;
        }
        System.out.println("Original: " + original4 + ", Reversed: " + reversed4);

        System.out.println("-----------------------------");

    }


    public static void main(String args[]){
        revnum1(1234);
        revnum2(45896);
        revnum3(4567);
        revnum4(5245);
    }
}
