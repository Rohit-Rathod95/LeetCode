class Solution {
       public boolean isPrime(int n) {
            if(n<2) {
                return false;
            }
            for(int i=2;i<n;i++) {
                if(n%i==0) 
                    return false;
            }
            return true;
        }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int num=left;num<=right;num++) {
            int ones=0;
            int temp=num;
            while(temp>0) {
                if(temp%2==1) 
                    ones++;
                temp=temp/2;
            }
            if(isPrime(ones)) 
                count++ ;
        }
        return count;
    }
}