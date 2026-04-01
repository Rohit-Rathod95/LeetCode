class Solution {
    static class Robot {
        int pos,health,index;
        char dir;
        Robot(int pos,int health,char dir,int index) {
            this.pos=pos;
            this.health=health;
            this.index=index;
            this.dir=dir;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        List<Robot> robots=new ArrayList<>();
        for(int i=0;i<n;i++) {
            robots.add(new Robot (positions[i],healths[i],directions.charAt(i),i));
        }
        Collections.sort(robots,(a,b) ->a.pos-b.pos );

        Stack<Robot> stack=new Stack<>();

        for(Robot curr: robots) {
            if(curr.dir=='R') {
                stack.push(curr);
            } else {
                while(!stack.isEmpty() && stack.peek().dir=='R' && curr.health>0) {
                    Robot top=stack.peek();
                    if(top.health<curr.health) {
                        stack.pop();
                        curr.health=curr.health-1;
                    } else if(top.health>curr.health) {
                        top.health=top.health-1;
                        curr.health=0;
                    } else {
                        stack.pop();
                        curr.health=0;
                    }
                }
                if(curr.health>0) {
                    stack.push(curr);
                }
            }
        }
        List<Robot> survivors=new ArrayList<>(stack);
        Collections.sort(survivors,(a,b) -> a.index-b.index);
        List<Integer> result=new ArrayList<>();
        for(Robot r:survivors) {
            result.add(r.health);
        }
        return result;
    }
}