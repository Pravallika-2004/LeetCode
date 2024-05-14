class Solution {
    public int findDuplicate(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int ch=nums[i];
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        for(Integer in:hm.keySet())
        {
            if(hm.get(in)>1)
            {
                res=in;
                break;
            }
        }
        return res;
    }
}