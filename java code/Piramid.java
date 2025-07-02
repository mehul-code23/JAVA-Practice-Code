public class Piramid {

    public static void main(String[] args) {

        int n = 10;

        // first half .....
        for(int i = 0; i<n;i++)
        {
            for(int k = i;k<n;k++)
            {
                System.out.print(" ");
            }
            for (int j = 0;j<i; j++)
            {
                System.out.print("*");

            }

            for (int j = 1 ; j <i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }


        // second half part ...
        for(int i = n; i>=0;i--)
        {
            for(int k = i;k<n;k++)
            {
                System.out.print(" ");
            }
            for (int j = 0;j<i; j++)
            {
                System.out.print("*");

            }

            for (int j = 1 ; j <i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
