class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] a = Integer.toString(x).split("");
        // System.out.println(a[0]);
        
        int sum = 0;
        
        for (int i=0; i<a.length; i++) {
            int num = Integer.parseInt(a[i]);
            sum += num;
        }
        
        if(x % sum != 0)
            answer = false;
         
        return answer;
    }
}