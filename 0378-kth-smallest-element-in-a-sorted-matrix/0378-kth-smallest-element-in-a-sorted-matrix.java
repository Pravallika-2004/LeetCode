class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] arr=new int[matrix.length*matrix.length];
        int p=0;
      for(int i=0;i<matrix.length;i++)
      {
          for(int j=0;j<matrix.length;j++)
          {
              arr[p]=matrix[i][j];
              p++;
          }
      }
        Arrays.sort(arr);
//         int si=1;
//         int ei=arr.length;
//         while(si<=ei)
//         {
//             int mid=(si+ei)/2;
            
//             if(mid==k)
//             {
//                 return arr[mid];
//             }
//             else
//                 if(mid>k)
//                 {
//                     ei=mid-1;
//                 }
//             else{
//                 si=mid+1;
//             }
//         }
        return arr[k-1];
    }
}