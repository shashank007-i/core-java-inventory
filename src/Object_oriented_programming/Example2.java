package Object_oriented_programming;//ENCAPSULATION--data hiding and bundling
//wrapping data and methods into a single unit (class).it helps protect data from outside interference


class student {
     private String name;
     private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0)this.age=age;
    }

    public int getAge() {
        return age;
    }

}
public class Example2 {
    public static void main(String args[]){
        student s1=new student();
        s1.setName("shashank");
        s1.setAge(22);

        System.out.println("Name:"+s1.getName());
        System.out.println("age:"+s1.getAge());
    }
}
