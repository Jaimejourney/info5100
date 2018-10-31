package INFO5100;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment7 {
    /**
     * 1. MyIndexOutOfBoundException
     */
    public static class MyIndexOutOfBoundException extends IndexOutOfBoundsException {
        private int lowerBound;
        private int upperBound;
        private int index;

        public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.index = index;
        }

        public String toString() {
            return "Error Message: Index " + index + ", but Lower bound: " + lowerBound + ", Upper bound:" + upperBound;
        }

    }

    public static void main(String[] args) throws MyIndexOutOfBoundException {
        List<Interval> list1 = new ArrayList<>();
        list1.add(new Interval(1,3));
        list1.add(new Interval(2,4));
        list1.add(new Interval(5,7));
        list1.add(new Interval(6,8));
        for (int i = 0; i < merge(list1).size(); i++) {
            System.out.println(merge(list1).get(i));
        }

        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        try {
            if (4 > list.size())
                throw new MyIndexOutOfBoundException(0, list.size(), 4);
            System.out.println(list.get(4));
        } finally {

        }

//        int[] a = {1,3};
//        int[] b = {2};
//        System.out.println(findMedianSortedArrays(a,b));
    }

    /**
     * 2.Modify the following parse() method so that it will compile
     */
    public static void parse(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    /**
     * 4. merger interval
     */
    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        public Interval(int s, int e) {
            start = s;
            end = e;
        }

        public String toString(){
            return "{"+this.start+","+this.end+"}";
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval> res = new ArrayList<Interval>();
        for (int i = 0 , j = 0 ; i < n; i++) {
            if(i == n-1 || start[i+1] > end[i]){
                res.add(new Interval(start[j],end[i]));
                j = i+1;
            }
        }
        return res;
    }

    /**
     * 5. There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays.
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // add your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            res.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            res.add(nums2[i]);
        }
        Collections.sort(res);
        if(res.size() % 2 == 0){
            double m = (double)res.get(res.size()/2);
            double n = (double)res.get((res.size()/2)-1);
            return (m+n)/2;
        }else{
            return res.get((res.size()-1)/2);
        }
    }
}
