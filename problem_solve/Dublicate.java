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