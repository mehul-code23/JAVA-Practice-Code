public class Quick_sort {

    static int partition(int[] arr , int low ,int  high)
    {
        int pivot = arr[high];

        int i = low -1;

        // In the loop start with the loop low to high....
        for (int j = low;j< high ; j++)
        {
            // In the statements we are get after and before pivot gater then and less than values .
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // This swap are use for the pivot set at position.
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        // This is return values of pivot correct position.
       return i+1;
    }
    static void quickSort(int[] arr , int low , int high)
    {
        if(low < high)
        {
            int pivot = partition(arr,low , high);

            // this is left side part ...
            quickSort(arr, low, pivot -1);

            // this is right side part ...
            quickSort(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {90,10,60,40,30,20,5};
        int n = arr.length;

        for (int i = 0 ; i < arr.length ;i++)
        {
            System.out.print(arr[i] +" ");
        }
        quickSort(arr,0,n-1);

        System.out.println();
        for (int i = 0 ; i < arr.length ;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}
