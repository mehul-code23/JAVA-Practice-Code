import java.util.Stack;
interface inter1
{
    // when we define values in interface this variable is final ....
    // this variable is static also
   String name1 = "Interface 1";

   void interPrint1();


}
interface inter2
{
    String name2 = "Interface 2";
    void interPrint2();
}
interface inter3 extends inter1 , inter2
{

    String name3 = "Interface 3";
    void interPrint3();
}

class Sub1 implements inter3
{
    public Sub1(){
        System.out.println("Constructor is called ...");
    }
    void Sub1Print(){
        System.out.println("Subclass Method ..");
    }

    public  void interPrint1(){
        System.out.println("Interface 1 called ...");
        System.out.println(inter1.name1);
    }

    public void interPrint2(){
        System.out.println("Interface 2 called ...");
        System.out.println(inter2.name2);
    }
    public void interPrint3(){
        System.out.println("Interface 3 called ...");
        System.out.println(inter3.name3);
    }
}
public class Demo6 {
    interface first{
        void hey();
    }
    static class second implements  first
    {
        void printSecond(){
            System.out.println("Nested class is called ....");
        }
        public void hey(){
            System.out.println("Now, Nested interface is called .....");
        }
    }
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        s.interPrint1();
        s.interPrint2();
        s.interPrint3();

        second s1 = new second();
        s1.hey();



        // Interface variable directly access without object creation
        // Because of in interface variable is static...
       // System.out.println(Sub1.name1);


    }
}
