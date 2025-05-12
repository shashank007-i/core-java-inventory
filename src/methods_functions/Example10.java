package methods_functions;

public class Example10 {
    static void arr1(int[] arr1) {
        System.out.println("Printing arr 1 from left to right:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println("--------------------------");
        System.out.println("Printing arr 1 from right to left:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println("--------------------------");
        return;
    }

    static void arr2(int[] arr2) {
        System.out.println("Printing arr 2 from left to right:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println("--------------------------");
        System.out.println("Printing arr 1 from right to left:");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println("--------------------------");
          return;
    }


    public static void main(String args[]){
        int[]arr1={10,20,30,40,50};
        int[]arr2={5,15,25,35,45,55};

        arr1(arr1);
        arr2(arr2);
    }


}




