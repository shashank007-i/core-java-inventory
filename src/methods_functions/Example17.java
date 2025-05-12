package methods_functions;

public class Example17 {
    static int max(int x,int y){
        return Math.max(x,y);
    }
    static float max(float x,float y){
        return Math.max(x,y);
    }
    static int max(int x,int y,int z){
        return Math.max(Math.max(x,y),z);
    }

    public static void main(String args[]){

        int a1=12;
        int a2=13;

        int lnMax=max(a1,a2);
        System.out.println("Maximum element:"+lnMax);

        int n1=1002;
        int n2=102;
        int n3=1212;

        lnMax=max(n1,n2,n3);
        System.out.println("Maximum number out of three numbers:"+lnMax);


        float f1=12.12f;
        float f2=0.456f;
        float lfmax= max(f1,f2);

        System.out.println("Maximum float number:"+lfmax);
    }
}
