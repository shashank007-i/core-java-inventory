package Object_oriented_programming;

class Animal{
    public void eat(){
        System.out.println("this animal eats food");
    }
}
class Dog extends Animal {

    public void bark() {
        System.out.println("the dog barks");
    }
}
public class Example3 {

    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
