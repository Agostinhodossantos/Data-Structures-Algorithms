/* 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.HashSet;

public class Dublicate{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean result =  containsDuplicate(nums);
        System.out.println(result);
    }

    private static int BinarySearchRecur(int x, int v[], int e, int d) {
        int meio = (e + d) / 2;
        if (v[meio] == x) {
            return meio;
        }

        if (e >= d) {
            return -1;
        } else {
            if (v[meio] < x) {
                return BinarySearchRecur(x, v, meio + 1, d);
            } else {
                return BinarySearchRecur(x, v, e, meio - 1);
            }
        }
    }

     private static int BinarySearch(int vet[], int chave, int tam) {
        int inf = 0;
        int sup = tam - 1;
        int meio;

        while (inf <= sup) {
            meio = (inf + sup) / 2;
            if (chave == vet[meio]) {
                return meio;
            }
            if (chave < vet[meio]) {
                sup = meio;
            } else {
                inf = meio + 1;
            }
        }
        return -1;
    }


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }

        return false;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        for(int i = 0; i < ll.length)
    }

    public static boolean containsDuplicate(long[] nums) {
        Arrays.sort(nums);

        for ( int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

}