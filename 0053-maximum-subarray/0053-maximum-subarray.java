class Solution {
    public int maxSubArray(int[] nums) 
    {
        // int n = nums.length;
        int result = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            // result = Math.max(nums[i], result+nums[i]);
            // sum = Math.max(sum,result);
            // result = result+nums[i];
            if(result< 0 )
            {
                result = nums[i];
            }
            else
            {
                result = result + nums[i];
            }
            if(sum<result)
            {
                sum = result;
            }

        }
        return sum;
    }
}