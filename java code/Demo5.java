interface class_A
{
    int a = 10;
    void print();
}
class First implements class_A{
   static  int no;

    static void printClass(){
        System.out.println("Class First ");
    }

    @Override
    public void print()
    {
        System.out.println("Interface are called here ... "+ a);
    }
}
class Second1 extends First {
    static void printClass(){}
}
public class Demo5 {
    public static void main(String[] args) {
        First.printClass();

        First.no = 10;

        First f = new First();
        f.print();
    }
}
