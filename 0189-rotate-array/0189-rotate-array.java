class Solution {
    public void rotate(int[] nums, int k) {
        
        Stack<Integer>st=new Stack<>();
        k=k%nums.length;
         int p=nums.length-k;
        int i=Math.abs(p);
    
         for(int j=i-1;j>=0;j--)
         {
             st.push(nums[j]);
         }
         int m=0;
         for(int l=Math.abs(i);l<nums.length;l++)
         {
          nums[m]=nums[l];
             m++;
         }
         while(st.size()>0)
         {
         for(int n=m;n<nums.length;n++)
         {
             nums[n]=st.pop();
         }
         
        }
        
//        ArrayList<Integer> al=new ArrayList<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             al.add(nums[i]);
//         }
        
//         for(int j=0;j<k;j++)
//         {
//             int delele = al.get(al.size()-1);
//             al.remove(al.size()-1);
//             al.add(0,delele);
//         }
        
//         for(int j=0;j<al.size();j++)
//         {
//             nums[j]=al.get(j);
//         }
    }
}