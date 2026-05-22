class Solution {
    public String simplifyPath(String path) {
        List<String> list=new ArrayList<>();
        String curr="";
        for(int i=0;i<=path.length();i++) {
            if(i==path.length() || path.charAt(i)=='/') {
                if(curr.equals("") || curr.equals(".")) {
                    //ignore
                }  else if(curr.equals("..")) {
                    if(!list.isEmpty()) {
                        list.remove(list.size()-1);
                    }
                } else {
                    list.add(curr);
                }
                curr="";
            } else {
                curr=curr+path.charAt(i);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(String folder:list) {
            ans.append("/").append(folder);
        }
        if (ans.length() == 0) {
    return "/";
} else {
    return ans.toString();
}
    }
}