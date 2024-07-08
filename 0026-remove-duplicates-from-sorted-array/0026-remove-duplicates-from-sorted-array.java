class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int gre=nums[nums.length-1]+1;
        for(int i=0;i<nums.length;i++)
        {
           int j=i+1;
            while(j<nums.length && nums[i]==nums[j])
            {
                j++;
                count++;
            }
            if(count>1)
            {
                while(count>1)
                {
                    nums[j-1]=gre;
                    count--;
                    j--;
                }
            }
            count=1;
        }
        int res=0;
        Arrays.sort(nums);
       
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==gre)
            {
                nums[i]='_';
            }
            else
            {
                res++;
            }
        }
        return res;
    }
}