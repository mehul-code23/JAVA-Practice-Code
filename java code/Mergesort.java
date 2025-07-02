public class Mergesort {


    static void merge(int[] arr , int left , int mid , int right)
    {
        int[] tempArray = new int[right - left +1];

        int index1 = left ;
        int index2 = mid+1;
        int x = 0;

        while(index1 <= mid &&  index2<= right) {
            if (arr[index1] <= arr[index2]) {
                tempArray[x] = arr[index1];
                x++;
                index1++;
            } else {
                tempArray[x] = arr[index2];
                x++;
                index2++;
            }

            // complete array store


        }
        while (index1 <= mid)
        {
            tempArray[x] = arr[index1];
            x++;
            index1++;
        }
        // complete array store .
        while (index2 <= right)
        {
            tempArray[x] = arr[index2];
            x++;
            index2++;
        }

        // transfer array ..
        int k = left;
        for(int i = 0 ; i< tempArray.length ; i++)
        {
            arr[k] = tempArray[i];
            k++;

        }



    }
    static void divide(int[] arr, int left , int right)
    {
        if( left < right)
        {
            int mid = (left +right)/ 2;
            divide(arr, left, mid);
            divide(arr, mid +1, right);

            merge(arr,left,mid,right);
        }
    }

    public static void main(String[] args) {
        int arr [] = {6,7,2,3,1,8};

        int n= arr.length;

        divide(arr,0,n-1);

        // printing array .....

        for(int i = 0 ; i< arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}

