class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int stone:stones) {
            list.add(stone);
        }
        while(list.size()>1) {
            Collections.sort(list);
            int n=list.size();

            int x=list.get(n-1);
            int y=list.get(n-2);

            list.remove(n-1);
            list.remove(n-2);

            if(y!=x) {
                list.add(x-y);
            }
        }
        if(list.size()==0) {
            return 0;
        }
        return list.get(0);
    }
}