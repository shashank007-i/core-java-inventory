package methods_functions;

public class Example15
{
    static int gcd(int m,int n){
        while (n != m){
            if (m>n){
                m=m-n;
            }
            else {
                n=n-m;

            }
        }
        return m;
    }
    public static void main(String args[]) {


        int result = gcd(45, 115);
         System.out.println("GCD of 45 and 115 is:"+result);

    }

}
