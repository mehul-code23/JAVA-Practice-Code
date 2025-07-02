package Superkey;

 class Superkeyword {

    public Superkeyword(){
        System.out.println("Hello from Super Class");
    }

    int no;
    void print(){
        System.out.println("Super keyword class called....");
    }
}

public class Subclass1 extends Superkeyword{


     public Subclass1(){
         System.out.println("Hello from Subclass 1");
     }
    public void printSub(){

        super.no = 50;
        super.print();
        System.out.println("Print variable of parent Class "+no);
    }
}

