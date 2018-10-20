package test.Function; 

import Function.Solution;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2018</pre> 
* @version 1.0 
*/ 
public class SolutionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: spiralOrder(int[][] matrix) 
* 
*/ 
@Test
public void testSpiralOrder() throws Exception { 
//TODO: Test goes here...
    Solution solution = new Solution();
    int[][] tmp = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    List<Integer> res = solution.spiralOrder(tmp);
    List<Integer> result = new ArrayList<>();
    result.add(1);
    result.add(2);
    result.add(3);
    result.add(6);
    result.add(9);
    result.add(8);
    result.add(7);
    result.add(4);
    result.add(5);
    for (int i = 0; i < res.size(); i++) {
        Assert.assertEquals(result.get(i),res.get(i));
    }
} 


} 
