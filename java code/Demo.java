class Example{
    Example(){
        this(50);
    }
    Example(int x)
    {
        System.out.println("Values from constructor :"+x);
    }
}

public class Demo {
    public static void main(String[] args) {
       new Example();


    }
}
