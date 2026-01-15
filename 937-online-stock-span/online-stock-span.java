class StockSpanner {
    Stack<Pair<Integer,Integer>> s=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int ans=1;
        while(!s.isEmpty()&&s.peek().getKey()<=price){
            ans+=s.peek().getValue();
            s.pop();
        }
        s.push(new Pair<>(price,ans));
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */