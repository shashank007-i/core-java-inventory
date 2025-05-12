package Arrays;

import java.util.Arrays;

public class Exmaple_0
{
    public static void main(String args[]){
        //declaring and initialization
        int []A ={1,2,3,4,5};
        int[]A1 =new int[10];

        System.out.println(A[3]);

        //traversing elements in array

        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }

        //practice-2
        int B1[]={1,2,3,4,5};
        int B2[]={2,3,4};
        int B3[]={0};

        int B4[]=new int[B1.length*2];
        for (int i=0;i<B1.length;i++){
          System.out.println(B1[i]);

        }


    }
}
