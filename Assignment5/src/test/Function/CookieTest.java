package test.Function; 

import Function.Cookie;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Cookie Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2018</pre> 
* @version 1.0 
*/ 
public class CookieTest { 

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
    Cookie cookie = new Cookie("Oatmeal Raisin Cookies", 4, 399);
    int res = cookie.getCost();
    Assert.assertEquals(133,res);
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here...
    Cookie cookie = new Cookie("Oatmeal Raisin Cookies", 4, 399);
    String res = cookie.toString();
    Assert.assertEquals("4 @ 3.99 /dz.\n" +
            "Oatmeal Raisin Cookies \t\t1.33",res);
} 


} 
