package methods_functions;

public class example18 {

    static float area(float radius){
        return (float) Math.PI * radius * radius;
    }
    static int area(int length,int breadth){
        return length*breadth;

    }

    public static void main(String args[]){
        float area1=area(10.0f);
        System.out.println("area of circle is:"+area1);

        int area2=area(10,32);
        System.out.println("area of rectangle is:"+area2);
    }
}
