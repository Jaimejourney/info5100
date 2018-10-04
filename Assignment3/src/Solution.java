public class Solution {
    public static String reverse(String s){
        if (s == null || s.equals("")) return "";
        s = s.trim();
        s = s.toLowerCase();
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length-1; i >= 0 ; i--) {
            sb.append(str[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Two      dogs";
        System.out.println(reverse(s));
    }
}
