class Solution {
    public static int countPairs(List<Integer> nums, int target) {
        int count=0;
        int n=nums.size();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((nums.get(i)+nums.get(j)) <target)
                {
                    count++;
                }
            }
                
        }
        return count;
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            list.add(ele);
           // arr[i]=sc.nextInt();
            
        }
        int res=countPairs(list,key);
        System.out.println(res);
        
    }
}