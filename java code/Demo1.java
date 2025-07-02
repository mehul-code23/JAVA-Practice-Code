class Example1{
    void methodA(){
        System.out.println("Method A ");
        this.methodB();
    }
    void methodB(){
        System.out.println("Method B");
    }
}
public class Demo1 {
    public static void main(String[] args) {
            Example1 e1 = new Example1();
            e1.methodA();

           // new Example1().methodA();
    }
}
