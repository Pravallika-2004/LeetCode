class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> al=new ArrayList<>();
           
        int count=m;
        for(int i=0;i<n;i++)
        {
            nums1[count]=nums2[i];
            count++;
        }
     Arrays.sort(nums1);   
    }
}