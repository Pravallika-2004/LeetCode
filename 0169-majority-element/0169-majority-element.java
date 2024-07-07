class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
           int ele=nums[i];
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
    
        int max=0;
        int res=0;
        for(Integer ele:hm.keySet())
        {
            if(hm.get(ele)>max)
            {
                max=hm.get(ele);
                res=ele;
            }
        }
        return res;
    }
    
}