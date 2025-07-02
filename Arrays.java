public class Arrays {
    static int largest(int a[])
    {
        int max= a[0];

        for (int i = 0 ; i< a.length ; i++)
        {
            if(a[i] > max )
            {
                max = a[i];
            }

        }
        return max;
    }
    public static void main(String[] args)
    {

        int array[] = {50,10,60,70,30,20};

        System.out.println(largest(array));
    }
}
