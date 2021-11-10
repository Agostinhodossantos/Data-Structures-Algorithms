/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/



class twosum {
    public static void main(String[] args) {
        int nums[] = {2,11,7,15}; 
        
        int targetPosition[] = {0, 0};


        for(int i = 0; i < nums.length; i++) {
            for(int y = i; y < nums.length; y++) {
                if(nums.length - 1 != y) {
                    if(nums[i] + nums[y+1] == 9) {
                        targetPosition[0] = i;
                        targetPosition[1] = y + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(targetPosition[0]+"-"+targetPosition[1]);   

    }

}