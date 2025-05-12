package Object_oriented_programming;//Important concepts
//OOP'S concept contains
//1-    ABSTRACTION
//2-    ENCAPSULATION
//3-    INHERITANCE
//4-    POLYMORPHISM
// These are all the principles which are commonly used
//   Abstraction:Hiding the internal details and showing the important features
//   Encapsulation:Grouping all the similar features in one single body or reference
//   Inheritance:Borrowing features from the previous existing entity and adding some important features to it for the code re-usability.
//   Polymorphism:Entities which are having similar properties can be grouped into single reference.


class Circle{
    public double radius;

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return Math.PI * radius;
    }
}


public class Example1 {

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Area" + circle.area());
        System.out.println("perimeter"+ circle.perimeter());


        circle.radius=10;
        System.out.println("area     :"+circle.area());
        System.out.println("Perimeter:"+circle.perimeter());

        Circle circle1=new Circle();
        circle1.radius=14;
        System.out.println("Area     :"+circle1.area());
        System.out.println("perimeter:"+circle1.perimeter());

    }
}
