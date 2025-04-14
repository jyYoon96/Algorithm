class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String num : nums) {
            int n = Integer.parseInt(num);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return min + " " + max;
    }
}