class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisors = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            // i = 2 , num = 5
            for (int j = i; j <= number; j += i) {
                divisors[j]++; 
            }
        }

        for (int i = 1; i <= number; i++) {
            if (divisors[i] > limit) {
                answer += power;
            } else {
                answer += divisors[i];
            }
        }

        return answer;
    }
}