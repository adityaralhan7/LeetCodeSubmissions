class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Pair<Integer,Integer>> stack=new Stack<>();
        int result[]=new int[n];
        stack.push(new Pair<>(temperatures[n-1],n-1));
        result[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int val=0;
            if(temperatures[i]<stack.peek().getKey()){
                result[i]=1;
                stack.push(new Pair<>(temperatures[i],i));
            }
            else{
                while(!stack.isEmpty()&&stack.peek().getKey()<=temperatures[i]){
                    val++;
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(new Pair<>(temperatures[i],i));
                    result[i]=0;
                }
                else{
                    result[i]=stack.peek().getValue()-i;
                    stack.push(new Pair<>(temperatures[i],i));
                }
            }
        }
        return result;
    }
}