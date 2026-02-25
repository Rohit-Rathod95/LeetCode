class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                int countA=countOnes(arr[j]);
                int countB=countOnes(arr[j+1]);
                if(countA>countB || countA==countB && arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    private int countOnes(int n) {
        String binary=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<binary.length();i++) {
            char ch=binary.charAt(i);
            if(ch=='1') {
                count++;
            }
        }
        return count;
    }
}