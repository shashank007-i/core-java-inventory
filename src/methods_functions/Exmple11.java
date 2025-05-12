package methods_functions;

public class Exmple11
{
    static void matrix1matrix2matrix3(int[][]matrix1,int[][]matrix2,int[][]matrix3){

        int[][] result=new int [3][3];
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                result[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("result of matrix addition");
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                System.out.println(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");



        int[][]result2= new int[3][3];
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                System.out.println(result2[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String args[]){

        int[][]matrix1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][]matrix2={
                {9,8,7},
                {6,5,4},
                {3,2,1},
        };
        int[][]matrix3={
                {2,3,4},
                {5,6,7},
                {8,9,10},
        };
    }




}
