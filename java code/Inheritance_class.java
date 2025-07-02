class SuperClass{
    String name = "Parent class";
    void write(){
        System.out.println("Hello from SuperClass");
    }
    void print(){
        System.out.println(name);
    }

    void sum(int a , int b )
    {
        System.out.println("Sum of two number :"+(a+b));
    }

    void sum(double a , double b){
        System.out.println("Sum of two number :"+(a+b));
    }

}

class child extends SuperClass
{
    void print(){
        name = "subclass";
        System.out.println(name);
    }
    void write(){
        System.out.println("Hello from ChildClass");
    }
}
public class Inheritance_class {
    public static void main(String[] args) {
    SuperClass s ;
    // this called to super class write methods
    s = new SuperClass();
    s.write();
    s.print();
    s.sum(10,50);
    s.sum(12.5,15.4);
    // this called to child class write methods
    s = new child();
    s.write();
    s.print();

    }
}
