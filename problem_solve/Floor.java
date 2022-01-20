import java.lang.annotation.Target;

class Floor {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = floor(arr, x);
        System.out.println(result);
    }

    static int floor(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (x < arr[m]) {
                r = m - 1;
            } else if(x > arr[m]) {
                l = m + 1;
            } else {
                return m + 1;
            }
        }

        return r;
    }
}