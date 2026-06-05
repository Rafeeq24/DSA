class Solution {
      public static int fib(int a,int b,int n){
        if(n<1){
            return a ;
        }
        int c=a+b;
        return fib(b,c,n-1);
    }
    public int fib(int n) {
        int i=0;
        int j=1;
       return fib(i,j,n);
    }
}
    
