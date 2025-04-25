class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        int a = 2;
        while (a != n+1) {
            arr[a] = (arr[a-1] + arr[a-2]) % 1234567;
            a++;
        }
        
        answer = arr[n];
        
        return answer;
    }
}