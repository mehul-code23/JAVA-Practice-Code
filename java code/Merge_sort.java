public class Merge_sort {
    static void merge(int arr[],int left,int mid ,int right)
    {
        int a1 = mid - left  +1;
        int a2 = right - mid ;

        int L[] = new int[a1];
        int R[] = new int[a2];

        for (int i = 0; i < a1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < a2; j++)
            R[j] = arr[mid + 1 + j];


        int i = 0, j = 0, k = left;
        while (i < a1 && j < a2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < a1) {
            arr[k] = L[i];
            i++; k++;
        }
        while (j < a2) {
            arr[k] = R[j];
            j++; k++;
        }


    }
    static void sort(int arr[] , int left , int right)
    {
       if (left < right)
       {
           int mid = left + (right - left) / 2 ;

           sort(arr,left,mid);
           sort(arr,mid+1,right);
           merge(arr,left,mid,right);
       }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,3,2,4,1};
        int left = 0;
        int n = arr.length-1;
        sort(arr,left,n);

        for(int i = 0; i <= n ; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
