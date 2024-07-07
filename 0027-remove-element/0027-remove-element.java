class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        if(nums.length>0)
        {
        int gre=nums[nums.length-1]+1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]=gre;
                count++;
            }
        }
        
        Arrays.sort(nums);
        return nums.length-count;
        }
     return 0;   
    }
}