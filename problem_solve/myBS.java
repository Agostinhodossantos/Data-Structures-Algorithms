public class myBS {
    public static void main(String[] args) {

        int [] list = {1, 2, 3,4,5};
        int target = 5;

        int result =  new myBS().binary_search(list, target);
        int arr1[] =  {5, 6, 1, 2, 3, 4};
        int n1 = arr1.length;
        System.out.println("The minimum element is "+ new myBS().findMin(arr1, 0, n1-1));
 
    }



    /*
    Given the sorted rotated array nums of unique elements, 
    return the minimum element of this array in O(log n) time
    */


    public int findMin(int arr[], int low, int high) {
        
        if (high < low) return arr[0];

        if (high == low) return arr[low];

        int mid = low + (high - low) / 2;

        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];
        
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);


    }

















    /*
    Given an array of integers nums that is sorted in ascending order,
     and an integer target, write a function to search target in nums.
     If target exists, then return its index. Otherwise, return -1.
    */
    public int binary_search(int list[], int target) {
        int first = 0;
        int last = list.length - 1;

        while (first <= last) {
            int midpoint = (first + last) / 2;

            if (list[midpoint] == target) {
                return midpoint;
            } else if (list[midpoint] < target) {
                first = midpoint + 1;
            } else {
                first = midpoint - 1;
            }
        }
        return -1;
    }
}