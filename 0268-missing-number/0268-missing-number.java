class Solution {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int mis=0;
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        int n=nums.length;
        
        for(int i=0;i<=n;i++)
        {
            if(set.contains(i)==true)
            {
                count++;
            }
            else
            {
                mis=i;
                
                
            }
            //return i;
        }
        return mis;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        int res= missingNumber(arr);
        System.out.println(res);
    }
}