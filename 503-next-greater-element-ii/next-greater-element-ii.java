class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int result[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            if(!stack.isEmpty()&&stack.peek()>arr[i%n]){
                result[i%n]=stack.peek();
                stack.push(arr[i%n]);
            }
            else{
                while(!stack.isEmpty()&&stack.peek()<=arr[i%n]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i%n]=-1;
                    stack.push(arr[i%n]);
                }
                else{
                    result[i%n]=stack.peek();
                    stack.push(arr[i%n]);
                }
            }
        }
            return result;
    }
}