package methods_functions;

public class Example14
{

    static boolean isPrime(int num)
    {
        boolean flag=true;
        for (int i=2; i< num/2;i++){
            if (num/2 != 0){
                flag =false;
                return flag;
            }
        }
        return flag;
    }
    public static void main(String args[]){

        boolean flag=isPrime(23);
        System.out.println("prime 23:" + flag);

        flag=isPrime(22);
        System.out.println("prime 19:"+flag);
    }
}
