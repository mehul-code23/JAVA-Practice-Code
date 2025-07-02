public class Demo8 {
    //static int i = 1 ;
    void printTillN(int n) {
        // code here
        if (n > 0) {
            printTillN(n - 1);
            System.out.print(n + " ");
        }


//        System.out.print(i+" ");
//        if(n < 2)
//        {
//            return;
//        }
//
//
//        i++;
//
//        n--;
//        printTillN(n);
    }

//    static int  i = 1;
//
//    void printNumber(int n)
//    {
//        if(n <= 0)
//        {
//            return;
//        }
//
//        System.out.print(i+" ");
//        i++;
//        n--;
//        printNumber(n);
//
//    }

    public static void main(String[] args) {

        Demo8 D8 = new Demo8();
        D8.printTillN(3);
    }
}
