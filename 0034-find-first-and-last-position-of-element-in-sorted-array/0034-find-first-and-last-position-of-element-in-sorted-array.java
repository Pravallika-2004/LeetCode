class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans=new int[2];
        int ls = startindex(nums,target);
        int rs= endindex(nums,target);
         ans[0]=ls;
        ans[1]=rs;
        
        return ans;
    }
    
    public int startindex(int[] arr,int target)
    {
        int si=0;
        int ei=arr.length-1;
        int pans=-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(arr[mid]==target)
            {
                pans=mid;
                ei=mid-1;
            }
            else
                if(arr[mid]>target)
                {
                    ei=mid-1;
                }
            else
            {
                si=mid+1;
            }
        }
        return pans;
    }
    
     public int endindex(int[] arr,int target)
    {
        int si=0;
        int ei=arr.length-1;
        int pans=-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(arr[mid]==target)
            {
                pans=mid;
                si=mid+1;
            }
            else
                if(arr[mid]>target)
                {
                    ei=mid-1;
                }
            else
            {
                si=mid+1;
            }
        }
        return pans;
    }
    
}