class Solution {
    public int searchInsert(int[] nums, int target) {
       int si=0;
        int ei=nums.length-1;
        int pans=nums.length;
        
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else
            if(nums[mid]>target)
            {
               // pans=mid;
                ei=mid-1;
            }
            else
            {
                si=mid+1;
            }
        }
        return si;
    }
}