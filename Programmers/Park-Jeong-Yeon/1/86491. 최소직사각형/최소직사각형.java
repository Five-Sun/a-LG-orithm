import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int width = 0;
        int height = 0;
    
        
        for(int i = 0; i < sizes.length; i++){
            // width는 무조건 긴거, height는 짧은거
            width = Math.max(width, Math.max(sizes[i][0], sizes[i][1]));
            height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return width * height;
    }
}