public class Selection_sort{
    public static void main(String[] args) {
        int [] arr = {64,25,12,22,11};

        for(int i = 0 ; i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

        for(int i = 0 ;i<arr.length-1;i++)
        {
            int min = i;

            for (int j = i+1 ; j< arr.length ; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;

                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        System.out.println();

        for (int i = 0 ; i< arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}