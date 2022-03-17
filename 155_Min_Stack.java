class MinStack {
    ArrayList<Integer> numbers;
    public MinStack() {
        numbers = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        numbers.add(val);
    }
    
    public void pop() {
        numbers.remove(numbers.size() - 1);
    }
    
    public int top() {
        return numbers.get(numbers.size() - 1);
    }
    
    public int getMin() {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) min = numbers.get(i);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */