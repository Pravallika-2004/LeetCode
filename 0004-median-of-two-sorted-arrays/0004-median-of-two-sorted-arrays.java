class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        double med=2.5000D;
        for(int i=0;i<nums1.length;i++)
        {
            arr.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++)
        {
            arr.add(nums2[j]);
        }
        
        Collections.sort(arr);
        Integer[] arr1 = new Integer[arr.size()];
        arr1 = arr.toArray(arr1);
              
        int totalen=arr1.length;
        
        if(totalen%2!=0)
        {
          int c=totalen/2;
           med=arr1[c]; 
        }
        
        else
        {
            int c=(totalen/2)-1;
            int d=totalen/2;
            
            med=(arr1[c]+arr1[d])/2.0;
        }
       return med;        
    }
}