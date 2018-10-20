package test.Function;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import Function.Candy;

/** 
* Function.Candy Tester.
* 
* @author <Authors name> 
* @since <pre>十月 19, 2018</pre> 
* @version 1.0 
*/ 
public class CandyTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getCost() 
* 
*/ 
@Test
public void testGetCost() throws Exception { 
//TODO: Test goes here...
    Candy candy = new Candy("Peanut Butter Fudge", 2.25, 399);
    int res = candy.getCost();
    Assert.assertEquals(898,res);

} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here...
    Candy candy = new Candy("Peanut Butter Fudge", 2.25, 399);
    String res = candy.toString();
    Assert.assertEquals("2.25 lbs. @ 3.99 /lb.\n" +
            "Peanut Butter Fudge   \t8.98",res);
} 


} 
