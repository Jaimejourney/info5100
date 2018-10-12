package INFO5100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {
    /*
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode" return 0.
     * s = "loveleetcode" return 2.
     */

    public int firstUniqChar(String s) {
        //TODO
        if(s == null || s.length() == 0) return -1;
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        List<Character> res = new ArrayList<>();
        for(Character chr:map.keySet()){
            if(map.get(chr) == 1){
                res.add(chr);
            }
        }
        if(res.size() == 0) return -1;
        for (int i = 0; i < chars.length; i++) {
            map1.put(chars[i],i);
        }
        int min = s.length();
        for (int i = 0; i < res.size(); i++) {
            if(map1.get(res.get(i)) < min){
                min = map1.get(res.get(i));
            }
        }

        return min;
    }

    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
        //TODO
        int res = 0;
        while(n > 0){
            res = res + n % 10;
            n = n/10;
        }
        if(res /10 > 0){
            return addDigits(res);

        }
        else{
            return res;
        }
    }

    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        //TODO
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[j] == 0){
                    swap(j,j+1,nums);
                }
            }
        }

    }
    public void swap(int m,int n,int[] nums){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }


    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    public  String longestPalindrome(String s) {
        //TODO
        int len = s.length();
        int max = 0;
        String res = "";
        for (int i = 0; i < len; i++) {
            for (int j = i+max; j <= len; j++) {
                if(isPalindrome(s.substring(i,j)) && j-i >max){
                    max = j-i;
                    res = s.substring(i,j);
                }
            }
        }
        return res;
    }

    public  boolean isPalindrome(String s){
        int start = 0,end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /*
    * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
    * Given input matrix = [ [1,2,3],
                   [4,5,6],
                   [7,8,9] ],
    * rotate the input matrix in-place such that it becomes: [  [7,4,1],
                                  [8,5,2],
                                   [9,6,3] ],
    */
    public int[][] rotate(int[][] matrix) {
        //TODO
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < matrix[0].length; j++) {
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int mid = matrix[0].length/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mid; j++) {
                int tmp =matrix[i][j];
                matrix[i][j]= matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] =tmp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        String s = "ccbab";
    }
}
