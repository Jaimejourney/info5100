package Test.INFO5100;

import INFO5100.Assignment4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Assignment4 Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 12, 2018</pre> 
* @version 1.0 
*/ 
public class Assignment4Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: firstUniqChar(String s) 
* 
*/ 
@Test
public void testFirstUniqChar() throws Exception { 
//TODO: Test goes here...
    Assignment4 assignment4 = new Assignment4();
    int res = assignment4.firstUniqChar("leetcode");
    Assert.assertEquals(0,res);
} 

/** 
* 
* Method: addDigits(int n) 
* 
*/ 
@Test
public void testAddDigits() throws Exception { 
//TODO: Test goes here...
    Assignment4 assignment4 = new Assignment4();
    Assert.assertEquals(2,assignment4.addDigits(38));
} 

/** 
* 
* Method: moveZeroes(int[] nums) 
* 
*/ 
@Test
public void testMoveZeroes() throws Exception { 
//TODO: Test goes here...
    Assignment4 assignment4 = new Assignment4();
    int[] tmp = {0,1,0,3,12};
    assignment4.moveZeroes(tmp);
    int[] num = {1,3,12,0,0};
    Assert.assertArrayEquals(num,tmp);
} 


/** 
* 
* Method: longestPalindrome(String s) 
* 
*/ 
@Test
public void testLongestPalindrome() throws Exception { 
//TODO: Test goes here...
    Assignment4 assignment4 = new Assignment4();
    String res = assignment4.longestPalindrome("babad");
    Assert.assertEquals("bab",res);
} 



/** 
* 
* Method: rotate(int[][] matrix) 
* 
*/ 
@Test
public void testRotate() throws Exception { 
//TODO: Test goes here...
    Assignment4 assignment4 = new Assignment4();
    int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] res =assignment4.rotate(num);
    int[][] answer = {{7,4,1},{8,5,2},{9,6,3}};
    Assert.assertArrayEquals(answer,res);
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


} 
