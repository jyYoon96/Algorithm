class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int leng = board.length;
        String color = board[h][w];
        String selectColor;
        
        if (h-1 >= 0) {
            selectColor = board[h-1][w];
            if (selectColor.equals(color)) {
                answer++;
            }
        }
        
        if (h+1 < leng) {
            selectColor = board[h+1][w];
            if (selectColor.equals(color)) {
                answer++;
            }
        }
        
        if (w-1 >= 0) {
            selectColor = board[h][w-1];
            if (selectColor.equals(color)) {
                answer++;
            }
        }
        
        if (w+1 < leng) {
            selectColor = board[h][w+1];
            if (selectColor.equals(color)) {
                answer++;
            }
        }
        
        return answer;
    }
}