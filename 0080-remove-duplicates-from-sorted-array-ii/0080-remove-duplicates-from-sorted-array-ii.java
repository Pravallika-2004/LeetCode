class Solution {
    public int removeDuplicates(int[] nums) {
      int count=1;
        int ind=0;
        int res=0;
        int gre=nums[nums.length-1]+1;
        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            int j=i+1;
            while(j<nums.length && nums[j]==ele)
            {
               j++;
                count++;
            }
            i=j-1;
            if(count>2)
            {
                while(count>2)
                {
                    nums[j-1]=gre;
                    count--;
                    j--;
                }
            }
            count=1;
        }
        
       Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
          
            if(nums[i]!=gre)
            {
               res++; 
            }
            else
            {
                nums[i]='_';
            }
        }
        return res;
    }
}