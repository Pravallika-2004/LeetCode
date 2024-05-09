class Solution {
    public static int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else
            if(nums[mid]>target)
            {
                ei=mid-1;
            }
            else
            {
                si=mid+1;
            }
        }
        return -1; //target is not present in the array in worst case condition  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
          int res=search(arr,key);
          System.out.println(res);
    }
}