package test.Function; 

import Function.IceCream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* IceCream Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2018</pre> 
* @version 1.0 
*/ 
public class IceCreamTest { 

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
    IceCream iceCream = new IceCream("Vanilla Ice Cream", 105);
    int res = iceCream.getCost();
    Assert.assertEquals(105,res);
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here...
    IceCream iceCream = new IceCream("Vanilla Ice Cream", 105);
    String res = iceCream.toString();
    Assert.assertEquals("Vanilla Ice Cream     \t1.05",res);
} 


} 
