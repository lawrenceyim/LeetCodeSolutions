class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answers = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) answers.add("FizzBuzz");
            else if (i % 5 == 0) answers.add("Buzz");
            else if (i % 3 == 0) answers.add("Fizz");
            else answers.add(String.valueOf(i));
        }
        return answers;
    }
}