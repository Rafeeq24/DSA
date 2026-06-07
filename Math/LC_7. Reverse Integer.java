class Solution {
    public int reverse(int x) {
        
        int y;
        long sum=0;
    
        if (x>0){
            y=1;
        }
        else{
            y=0;
            x=-x;
        }
    
        while(x>0){
            int rem=x%10;
        
           sum=sum*10+rem;
            if(sum > Integer.MAX_VALUE)
            return 0;
            x=x/10;

        }
       
        if(y==0){
            return (int)-sum;
        }
        else{
            return (int)sum;
        }
    }
}
