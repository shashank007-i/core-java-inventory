package methods_functions;
// in this question we are using the static calling method in which we will pass two parameters a,b in the first step we will compare the values of a,b then in the modify primitives method we will increase tghe value of a by
//+1 then return the value of a to the main function in which the instance of the class will get updated by the new instance class and the value of a which is increased by +1 will get updated
//






public class Example12
{
    static int max(int x,int y){
        if (x>y){
            return x;
        }else {
            return y;
        }
    }
    int min(int x,int y){
        if (x < y){
            return x;
        }
        else {
            return y;
        }
    }

    void modifyPrimitives(int x){
        System.out.println("function"+x);
        x++;
        System.out.println("Function"+x);
        return;
    }
    public static void main(String args[]){
        int a=10;
        int b=15;

        int c=max(a,b);
        System.out.println("max : "+c);

        Example12 instance = new Example12();
        c= instance.min(a,b);

        System.out.println("min : " + c);

        instance.modifyPrimitives(a);

        System.out.println("main : "+a);
    }

}
