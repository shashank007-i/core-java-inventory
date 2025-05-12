package methods_functions;

public class Example13 {

         static void update(int A[]){
             A[0] = 17;
         }
         static void change(int A[],int index,int value){
             A[index] =  value;
         }
         public static void main(String args[]){
             int[] nums={1,2,3,4,5,6};

             for (int x : nums){
                 System.out.print(x + " ");
             }
             System.out.println();
             update(nums);


             for (int x:nums){
                 System.out.print(x+" ");
             }
             System.out.println();


             change(nums,3,11);
             for (int x:nums){
                 System.out.print(x+ " ");
             }
             System.out.println();
         }



}

