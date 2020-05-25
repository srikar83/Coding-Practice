class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=i+1;
        while(j<=arr.length-1)
        {
            if(arr[i]==0 && arr[j]!=0)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0)
            {
                j++;
            }
            else
            {
                i=j;
                j++;
            }
             
        }
    }
}
