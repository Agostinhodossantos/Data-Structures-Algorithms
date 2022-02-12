public class myBS {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 8;
        int result = celing(arr, 0, n - 1, x);
        System.out.println(result);
    }

    static int celing(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
             // Check if x is present at mid
            if (arr[m] == x)
                return m;
        }
 
        // if we reach here, then element was
        // not present
        return l;
    }

<<<<<<< HEAD

    int sqrt(int x) {
        
    }


=======
>>>>>>> f6de6468a378de4585a21861e481f04ecad1d1a0
    /*
    Given a sorted array arr[] consisting of N distinct integers and an integer K, 
    the task is to find the index of K, if it’s present in the array arr[]. 
    Otherwise, find the index where K must be inserted to keep the array sorted.
    */

    public static int findPosition(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int midpoint = (low + high) / 2;

            if (target == arr[midpoint]) {
                return midpoint;
            } else if(arr[midpoint] < target) {
                low = midpoint + 1;
            } else {
                high = midpoint - 1;
            }
        }
        return low + 1;
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

    // Duplicated elements
    public int findMainD(int arr[], int low, int high) {
        while(low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;
            else if(arr[mid] > arr[high])
                low = mid + 1;
            else 
                high = mid;
        }
        return arr[high];
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
                last = midpoint - 1;
            }
        }
        return -1;
    }
}