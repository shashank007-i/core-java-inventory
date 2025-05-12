package operators_and_expressions;

public class exp9
{
    public static void main(String args[]){
        int x=5;
        int y=4;
        int a;
        int b;

        b=2*++x + 3*y++;
        a=2*x++ + 3*++y;
            System.out.println(a);
            System.out.println(b);

    }
}
