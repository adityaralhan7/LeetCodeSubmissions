class Solution {
    public int sumSubarrayMins(int[] arr) {
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                nsl[i]=-1;
            }
            else{
                while(!stack.isEmpty()&&arr[i]<arr[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()) nsl[i]=-1;
                else nsl[i]=stack.peek();
            }
                stack.push(i);
        }
        stack.clear();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()) nsr[i]=arr.length;
                else nsr[i]=stack.peek();
            }
                stack.push(i);
        }
        long ans=0;
        int mod=1000000007;
        for(int i=0;i<arr.length;i++){
            int l=i-nsl[i];
            int r=nsr[i]-i;
            long val=(1L*arr[i]*l*r)%mod;
            ans=(ans+val)%mod;
        }
        return (int)ans;
    }
}