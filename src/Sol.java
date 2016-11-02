import java.util.*;
class Sol
{
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        Sol rotate = new Sol();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0 ; i<a ; i++ )
        {
        	arr[i] = scan.nextInt();
        }
        rotate.leftRotate(arr, b, a);
        rotate.printArray(arr, a);
    }
}