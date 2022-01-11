import java.util.ArrayList;

class MovingAverage {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int size_limit;
    
    public MovingAverage(int size) {
        size_limit = size;    
    }
    
    public double next(int val) {
        numbers.add(val);
        if (numbers.size() > size_limit) numbers.remove(0);
        double sum = get_total(numbers);
        double average = sum / numbers.size();
        return average;
    }
    
    public double get_total(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */