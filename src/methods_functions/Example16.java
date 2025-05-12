package methods_functions;

public class Example16 {

    static int max(int nums[]){
        int res=nums[0];
        for (int i=1;i<nums.length;i++){
            if (res < nums[i]){
                res= nums[i];
            }
        }
        return res;
    }

    public static void main(String[]args){
        int[] nums={12,16,20,34,76,-99,7};

        int maxElement=max(nums);
        System.out.println("max element:"+ maxElement);



    }
}
