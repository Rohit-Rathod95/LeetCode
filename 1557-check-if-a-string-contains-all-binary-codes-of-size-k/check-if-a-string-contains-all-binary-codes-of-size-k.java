class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total=(int) Math.pow(2,k);
        if(s.length()-k+1<total) {
            return false;
        }
        boolean exits[]=new boolean[total];
        for(int i=0;i<=s.length()-k;i++) {
            String sub=s.substring(i,i+k);
            int num=Integer.parseInt(sub,2);
            exits[num]=true;
        }

        for(int i=0;i<total;i++) {
            if(!exits[i]) {
                return false;
            }
        }
        return true;
    }
}