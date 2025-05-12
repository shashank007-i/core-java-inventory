package methods_functions;

public class Example3 {
    static void printstudentresult(String name, String subject, int marks, String grade, String remarks) {
        System.out.println("Name:" + name);
        System.out.println("Subject:" + subject);
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + grade);
        System.out.println("remark:" + remarks);
        System.out.println("--------------------------");

    }

    public static void main(String args[]) {

        printstudentresult("shashank", "mathematics", Integer.parseInt("99"), "A++", "excellent");
    }
}

