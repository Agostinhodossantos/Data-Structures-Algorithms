public class FindSmallest {
    public static void main(String[] args) {
        char[] letters = {'b','c','b'};
        char target = 'z';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    static char nextGreatestLetter(char[] arr, char x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (x < arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            } 
        }

        return arr[l % arr.length];
    }
}
