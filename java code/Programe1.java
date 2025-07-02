public class Programe1 {

    static void conqur(int[] arr, int left , int mid , int right)
    {
        int[] temp = new int[right -left + 1];

        int index1 = left;
        int index2 = mid+1;
        int x = 0 ;

        while(index1<= mid && index2 <=right)
        {
            if(arr[index1]<=arr[index2])
            {
                temp[x++] = arr[index1++];
            }
            else
            {
                temp[x++] = arr[index2++];
            }
        }

        while(index1 <= mid)
        {
            temp[x++] = arr[index1++];
        }
        while(index2<=right)
        {
            temp[x++] = arr[index2++];
        }

        for(int i = 0, j = left ;i< temp.length;i++)
        {
            arr[j] = temp[i];
            j++;
        }



    }
    static void devide(int[] arr , int left , int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2 ;

            devide(arr, left, mid);
            devide(arr, mid+1, right);

            conqur(arr,left,mid,right);
        }
    }

    public static void main(String[] args) {
        int [] arr = {10,2,5,1,3,70};
        int n = arr.length;
        devide(arr,0,n-1);

        for(int i = 0 ; i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
