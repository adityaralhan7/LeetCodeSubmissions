class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int a:asteroids){
            while(!stack.isEmpty()&&a<0&&stack.peek()>0){
                int sum=stack.peek()+a;
                if(sum<0){
                    stack.pop();
                }
                else if(sum>0){
                    a=0;
                    break;
                }
                else{
                    stack.pop();
                    a=0;
                    break;
                }
            }
            if(a!=0) stack.push(a);
        }
        int size=stack.size();
        int arr[]=new int[size];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
    }
}