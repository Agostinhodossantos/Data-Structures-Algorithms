import java.util.EnumMap;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        
    }

    int[] searchRange(int[] arr, int target) {
        int[] ans = new int[]{-1, -1};

        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    int search(int[] arr, int target, boolean findStartIndex){
       
        int ans = -1;

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
        
            if (target < arr[m])
                l = m + 1;
            else if (target > arr[m])
                r = m - 1;
            else {
                ans = m;
                if(findStartIndex) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
                return m;
            }

        }
        return ans;
    }
}