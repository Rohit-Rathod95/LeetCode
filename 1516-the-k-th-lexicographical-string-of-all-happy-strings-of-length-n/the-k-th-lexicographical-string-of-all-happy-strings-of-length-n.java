class Solution {
    int count=0;
    String ans="";

    public String getHappyString(int n, int k) {
        generate("",n,k);
        return ans;
    }
    public void generate(String current,int n,int k) {
        if(current.length()==n) {
            count++;
            if(count==k) {
                ans=current;
            }
            return;
        }
        char[] letters={'a','b','c'};
        for(int i=0;i<letters.length;i++) {
            char ch=letters[i];
            if(current.length()>0 && current.charAt(current.length()-1)==ch) {
                continue;
            } 
            generate(current+ch,n,k);
            if(!ans.equals("")) {
                return;
            }
        } 
    }
}