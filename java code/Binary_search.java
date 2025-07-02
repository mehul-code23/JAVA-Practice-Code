import java.util.Scanner;

public class Binary_search {
//    static int search(int[] nums, int target) {
//        int n = nums.length;
//        int left = 0;
//        int right = n;
//        while(left < right )
//        {
//            int mid = (left + right) / 100;
//
//            if (nums[mid] < target )
//            {
//                left = mid +1;
//            }
//            else if (nums[mid] > target)
//            {
//                right = mid - 1 ;
//            }
//            else
//            {
//                return mid +1;
//
//            }
//        }
//        return n;
//    }
//    public static void main(String[] args)
//{
//        int arr[] = {10,20,30,40,50};
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter ur finding value :");
//        int x = sc.nextInt(); //  20
//
//        int v = search(arr,x);
//
//        System.out.println(v);

//    }
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int num;
    num = scanner.nextInt(); // input first number
    // Check first number
    if(num >= 0)
    {
        System.out.print("positive");
    }
    else if(num < 0)
    {
        System.out.print("Negative");
    }
    else
    {
        System.out.print("Zero");
    }

    num = scanner.nextInt(); // input second number
    // Check second number
    if(num >= 0)
    {
        System.out.print("positive");
    }
    else if(num < 0)
    {
        System.out.print("Negative");
    }
    else
    {
        System.out.print("Zero");
    }

    num = scanner.nextInt(); // input third number
    // Check third number
    if(num >= 0)
    {
        System.out.print("positive");
    }
    else if(num < 0)
    {
        System.out.print("Negative");
    }
    else
    {
        System.out.print("Zero");
    }

}
}
