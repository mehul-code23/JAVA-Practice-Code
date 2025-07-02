public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] ={30,50,80,10,20};

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        int n = arr.length;
        int key , j;

        for (int i = 0 ; i< n ; i++)
        {
            key = i ;
            j = i -1;

            while ( j>= 0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }


        System.out.println(arr[0]);
//        for(int m = 0 ; m < n ; m++)
//        {
//            System.out.println(arr[m]);
//            System.out.println(arr[m]);
//        }

    }
}
