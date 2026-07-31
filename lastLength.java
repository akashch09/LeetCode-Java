class Solution {
    public int lengthOfLastWord(String s) {
        
        int l=s.length();
        int count=0;
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if(count==0){
                continue;
            }else{
                break;
            }
            
        }
        return count;
    }
}