class Solution {
    public int singleNonDuplicate(int[] nums) {
        int idx=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ch=nums[i];
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        for(Integer ele:hm.keySet())
        {
            if(hm.get(ele)==1)
            {
                idx=ele;
                break;
            }
        }
        return idx;
    }
}