package methods_functions;

public class example2 {
    static void printinvoice(String itemName, String price, String quantity, String total){

        System.out.println("item:"+itemName);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Total:"+total);
        System.out.println("-------------------------------");
        return;
    }
    public static void main(String args[]){
        int total,quantity=2,price=50000;
        total=quantity * price;
        printinvoice("laptop","50000","2",""+total);
    }



}
