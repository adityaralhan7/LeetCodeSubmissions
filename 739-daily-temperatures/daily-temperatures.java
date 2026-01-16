class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> stack=new Stack<>();
        stack.push(n-1);
        int result[]=new int[n];
        for(int i=n-2;i>=0;i--){
            if(temperatures[i]<temperatures[stack.peek()]){
                result[i]=stack.peek()-i;
                stack.push(i);
            }
            else{
                while(!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i]=0;
                    stack.push(i);
                }
                else{
                    result[i]=stack.peek()-i;
                    stack.push(i);
                }
            }
        }
        return result;
    }
}