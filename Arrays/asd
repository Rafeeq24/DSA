class Solution {
    public int[] twoSum(int[] arr, int target) {

        int i=0;
        int j=arr.length-1;
        int[] res=new int[2];
        while(i<=j)   {
            if(arr[i]+arr[j]==target){
                res[0]=i;
                res[1]=j;
                break;

            }
            else if (arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        } 
        return res;    
    }
}
