class Solution {
    public int searchInsert(int[] nums, int target) {

        for (int i=0; i<nums.length; i++){

            //comparing target with elements of nums array

            //if target match with nums[i] or is less than nums[i] get i
            if(nums[i]==target || target < nums [i]){
                return i;
            }

            //if target is just 1 more than num[i] and is less than next number return next i
            else if (target == nums[i]+1 || target < nums[i+1]){
                return i+1;
            }

            // if num is more than the last listed element then get the length as it is 1 more than last i
            else if (target > nums[nums.length-1]){
                return nums.length;
            }
        }

        // return null;
        return 0;
    }
}