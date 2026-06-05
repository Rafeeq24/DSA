class Solution {
    public boolean isPalinSent(String s) {
        // code here
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char a=s.charAt(i);
            char b=s.charAt(j);
            
            if(a>='A' && a<='Z'){
                a= (char)(a+32);
            }
            if(b>='A' && b<='Z'){
                b= (char)(b+32);
            }
            
             if(!(a>='a' && a<='z' || a>='0' && a<='9')){
                i++;
                continue;
            }
            if(!(b>='a' && b<='z' || b>='0' && b<='9')){
                j--;
                continue;
            }
            
            if((a>='a' && a<='z' || a>='0' && a<='9') && (b>='a' && b<='z' || b>='0' && b<='9')){
                if(a==b){
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}

