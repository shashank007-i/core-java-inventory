import java.util.Scanner;

public class line_collab

{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String sName;
        String sLineAboutYou;

        System.out.println("hello,may i know your name:");
        sName= sc.next();//next() method is used to read the single word from keyboard

        System.out.println("can you describe yourself in a single line");
        sLineAboutYou= sc.nextLine();

        System.out.println("hello,"+sName);
        System.out.println("wow that's some hard stuff:"+sLineAboutYou);




    }





}
