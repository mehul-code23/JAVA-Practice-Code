class first{
    final int number = 10;
    void printValue(){
        // final variable can not be changed ....
        //number = 50;
        System.out.println("Number print :"+number);

    }


    final void print()
    {
        System.out.println("Hello from First class");

    }

}

final class second extends first
{
    void print_second()
    {
        System.out.println("Hello from second ...");
    }
    // final method cannot override
//    final void print(){
//
//    }
}
public class Demo4 {
    public static void main(String[] args) {
        second s = new second();
        s.printValue();
        s.print();
        s.print_second();


    }
}
