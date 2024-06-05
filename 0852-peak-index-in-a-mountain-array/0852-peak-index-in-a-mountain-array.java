class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int si=0;
        int ei=arr.length-1;
        
        int pans=-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(mid==0)
            {
                if(arr[mid]>arr[mid+1])
                {
                    return mid;
                }
                else
                {
                    si=mid+1;
                }
            }
            else
            if(mid==arr.length-1)
            {
                if(arr[mid-1]<arr[mid])
                {
                    return mid;
                }
                else
                {
                    ei=mid-1;
                }
            }
            else
            
            if((arr[mid-1]<arr[mid]) && (arr[mid+1]<arr[mid]))
            {
                //peek index
                return mid;
            }
            else
                if(arr[mid-1] < arr[mid])
                {
                   //uphill mountain
                    pans=mid+1;
                    si=mid+1;
                }
            else
            {
                //downhill mountain
                ei=mid-1;
            }
        }
        return pans;
    }
}