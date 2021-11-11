/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/
import java.util.HashMap;
import java.util.Map;


class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        int targetPosition[] = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int y = i; y < nums.length; y++) {
                if(nums.length - 1 != y) {
                    if(nums[i] + nums[y+1] == target) {
                        targetPosition[0] = i;
                        targetPosition[1] = y + 1;
                        break;
                    }
                }
            }
        }
        return targetPosition;
    }

    public static int[] twoSumMap(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {11,7,2,15}; 
        int result[] = twoSumMap(nums, 9);

        System.out.println(result[0] +" - "+ result[1]);   

    }

}