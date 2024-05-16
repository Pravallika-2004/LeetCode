class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st=new Stack<>();
        int[] num2nger = new int[nums2.length];
            
            for(int i=0;i<nums2.length;i++)
            {
                int ele=nums2[i];
                
                while(st.size()>0 && ele>nums2[st.peek()])
                {
                    int ind=st.pop();
                    num2nger[ind]=ele;
                }
                st.push(i);
            }
        if(st.size()>0)
        {
            while(st.size()!=0)
            {
                int ind=st.pop();
                num2nger[ind]=-1;
            }
        }
        
        int[] num1nger = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    num1nger[i]=num2nger[j];
                }
            }
        }
        
        return num1nger;
    }
}