class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        int n=nums.length;
        int pans=-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(nums[mid]>nums[n-1])
            {
                si=mid+1;
            }
            else
            {
                if(nums[mid]<=nums[n-1])
                {
                    //2nd sorted array
                    pans=mid;
                    ei=mid-1;
                }
            }
        }
        
        if(target>=nums[pans] && target<=nums[n-1])
        {
            si=pans;
            ei=n-1;
        }
        else
        {
            si=0;
            ei=pans-1;
        }
        
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
                    ei=mid-1;
                }
            else
            {
                si=mid+1;
            }
        }
        
        return -1;
    }
}