import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int down = matrix.length - 1;
        if (down < 0) {
            return res;
        }

        int right = matrix[0].length - 1;
        int top = 0;
        int left = 0;
        while (top <= top && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if(down - top >= 0) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
                down--;
            }

            if(right - left >= 0) {
                for (int i = down; i >= top; i--) {
                    res.add(matrix[left][i]);
                }
                left++;
            }
        }
        return res;
    }


}