class Solution {
    ArrayList<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        solve(sb,n);
        return list;
    }
    public boolean isValid(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='(') count++;
            if(ch==')'){
                count--;
                if(count<0) return false;
            }
        }
        return count==0;
    }
    public void solve(StringBuilder sb,int n){
        if(sb.length()==2*n){
            if(isValid(String.valueOf(sb))) list.add(String.valueOf(sb));
        }
        if(sb.length()>2*n) return;
        sb.append('(');
        solve(sb,n);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        solve(sb,n);
        sb.deleteCharAt(sb.length()-1);
    }
}