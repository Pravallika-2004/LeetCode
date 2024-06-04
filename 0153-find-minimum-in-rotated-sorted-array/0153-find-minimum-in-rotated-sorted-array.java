class Solution {
    public int findMin(int[] nums) {
        int si=0;
        int ei=nums.length;
        int pans=-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(nums[mid]>nums[nums.length-1])
            {
                //2nd sorted array
                si=mid+1;
            }
            else
            {
                //second sorted array
                pans=nums[mid];
                ei=mid-1;
            }
        }
        return pans;
    }
}