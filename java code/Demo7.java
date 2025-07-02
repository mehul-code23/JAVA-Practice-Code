public class Demo7 {

    public static void main(String[] args) {

        int n = 5;
        int arr[] = {10 , 20 , 30 ,40,50};

        // Logic of bubble sort
        for (int i = 0 ; i<n;i++)
        {
            for (int j = i; j < n;j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println("Print Array :");
        for (int i = 0 ; i < n ;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
