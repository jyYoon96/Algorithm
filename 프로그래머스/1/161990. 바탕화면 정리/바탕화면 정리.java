class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int minlow = 100;
        int maxlow = 0;
        int mincol = 100;
        int maxcol = 0;
        
        for (int i=0; i<wallpaper.length; i++) {
            for (int j=0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {{
                    // System.out.println("1");
                    if (i < minlow) {
                        minlow = i;
                    }
                    if (i > maxlow) {
                        maxlow = i;
                    }
                    if (j < mincol) {
                        mincol = j;
                    }
                    if (j > maxcol) {
                        maxcol = j;
                    }
                }}
            }
        }
        answer = new int[]{minlow, mincol, maxlow+1, maxcol+1};

        
        return answer;
    }
}