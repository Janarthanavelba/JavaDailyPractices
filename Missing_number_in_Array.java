/* Given an array nums containing n distinct numbers in the range [0, n],
  return the only number in the range that is missing from the array. */

 class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int miss=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i]) 
            {
                miss=i;
                break;
            }
            c++;
        }

        if(c!=nums.length) return miss;
        else return nums.length;
        
    }
}
