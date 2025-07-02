class Parent
{
    int a;
    int b;
    // constructor of parent class
    Parent(){

    }
    Parent(int a , int b)
    {
      this.a = a;
      this.b = b;
        System.out.println("constructor of A + B :"+(a+b));
    }
    // Override methods
    void hello()
    {
        System.out.println("Hello from Parent class");
    }

    // overload methods
    void add( )
    {
        System.out.println("Addition of A + B :"+(a+b));
    }
}

class Subclass extends Parent{
   // constructor of Subclass.
    Subclass(int a , int b){
       super(a, b);
   }

   @Override
    // override methods .
    void hello()
    {
        System.out.println("Hello from Subclass");
    }
    // Overload methods.
    void add(double a , double b)
    {
        System.out.println("Addition of A + B :"+(a+b));
    }

}
public class Polymorphism {
    public static void main(String[] args) {
       // pass values of subclass constructor .
        Subclass s = new Subclass(10,20);
       s.hello();

       // call methods of subclass
       s.add(1.3,1.5);
       Parent p = new Parent();



    }
}
