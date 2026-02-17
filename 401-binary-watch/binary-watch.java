class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans=new ArrayList<>();
        for(int h=0;h<12;h++) {
            for(int m=0;m<60;m++) {
                int leds=getOnes(Integer.toBinaryString(h))+getOnes(Integer.toBinaryString(m));
                if(leds==turnedOn) {
                    ans.add(format(h,m));
                }
            }
        }
        return ans;
    }
    private int getOnes(String s) {
            int count=0;
            for(int i=0;i<s.length();i++) {
                char ch=s.charAt(i);
                if(ch=='1') {
                    count++;
                }
            }
            return count;
    }
    private String format(int h,int m){
        if(m<10) {
            return h+":0"+m;
        }
        return h+":"+m;
    }
}