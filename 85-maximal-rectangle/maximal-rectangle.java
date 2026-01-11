class Solution{
    public int maximalRectangle(char[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int[] height=new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                height[j]=(matrix[i][j]=='1')?height[j]+1:0;
            }
            ans=Math.max(ans,maxRectangleArea(height));
        }
        return ans;
    }

    int maxRectangleArea(int[] height){
        int max=0;
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<=height.length;i++){
            int curr=(i==height.length)?0:height[i];
            int start=i;
            while(!st.isEmpty()&&st.peek()[0]>curr){
                int[] top=st.pop();
                max=Math.max(max,top[0]*(i-top[1]));
                start=top[1];
            }
            st.push(new int[]{curr,start});
        }
        return max;
    }
}
