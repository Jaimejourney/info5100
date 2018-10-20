package test.Function; 

import Function.Sundae;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Sundae Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2018</pre> 
* @version 1.0 
*/ 
public class SundaeTest { 

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
    Sundae sundae = new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50);
    int res = sundae.getCost();
    Assert.assertEquals(195,res);
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here...
    Sundae sundae = new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50);
    String res = sundae.toString();
    Assert.assertEquals("Hot Fudge Sundae with\n" +
            "Choc. Chip Ice Cream \t\t1.95",res);
} 


} 
