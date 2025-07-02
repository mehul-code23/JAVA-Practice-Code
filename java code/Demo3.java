class Example2{
    Example2 getobject()
    {
        return this;
    }

    void show(){
        System.out.println("Current methods called....");
    }
}
public class Demo3 {
    public static void main(String[] args) {
       Example2 e1 = new Example2();


       Example2 returnobj = e1.getobject();
       returnobj.show();


    }
}
