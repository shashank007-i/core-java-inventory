package section9;

public class Example1
{
         public static void main(String[] args) {
             int lnNum1 = 10;
             float lfNum1 = 12.003456f;
             boolean isEven = true;

             // Printing Text
             System.out.print("Hello JVM");
             System.out.print("This is Windows Platform");

             System.out.println("JavaCompiler Gives Byte Code");
             System.out.println("JVM Reads The Byte Code Line By Line And Executes On Target Platform");

             // Print Content Of Variables
             System.out.println(lnNum1);
             System.out.println(lfNum1);

             System.out.printf("integer number 1 %d \n",lnNum1);
             System.out.printf("float number 2 %f \n",lfNum1);
             System.out.printf("Boolean value %b \n",isEven);

             String formatString = String.format("lnnum1: %d,lfnum1 : %f,isEven : %b",lnNum1,lfNum1,isEven);
             System.out.println(formatString);
         }

     }


