package methods_functions;

public class Exmaple5
{
    static void firstrange(int x,int y){
        for (int i=x;i<=y;i++){
            System.out.println("numbers:"+i);
            System.out.println("-----------------");
        }
        return;
    }
    static void secondrange(int x,int y){
        for (int i=x;i<=y;i++){
            System.out.println("numbers:"+i);
            System.out.println("----------------");
        }
        return;
    }
    static void thirdrange(int x,int y){
        for (int i=x;i<=y;i++){
            System.out.println("numbers:"+i);
            System.out.println("------------------");
        }
        return;
    }
    static void fourthrange(int x,int y){
        for (int i=x;i<=y;i++){
            System.out.println("numbers:"+i);
            System.out.println("-----------------");
        }
        return;
    }
    static void fifthrange(int x,int y){
        for (int i=x;i<=y;i++){
            System.out.println("numbers:"+i);
            System.out.println("------------------");
        }
        return;
    }

    public static void main(String args[]){
        firstrange(1,5);
        secondrange(2,6);
        thirdrange(3,7);
        fourthrange(4,8);
        fifthrange(5,9);

    }


}
