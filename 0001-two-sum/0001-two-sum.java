class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointer approach i can use
        //TC: O(n)
         
        class Pair{
            int value;
            int inx;
            
            Pair(int val,int ind)
            {
                this.value=val;
                this.inx=ind;
            }
        }
        
        Pair[] arr=new Pair[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=new Pair(nums[i],i);
            
        }
        //sorting depending on value
        
        Arrays.sort(arr,(Pair first,Pair second)->first.value-second.value);
                    
                    
        
        int left=0;
        int right=nums.length-1;
        int[] ans=new int[2];
        while(left<right)
        {
         int sum=arr[left].value+arr[right].value;
            
            if(sum==target)
            {
                ans[0]=arr[left].inx;
                ans[1]=arr[right].inx;
                return ans;
            }
            else
                if(sum>target)
                {
                    right--;
                }
            else
            {
                left++;
            }
        }
        return ans;
    }
}