package test.Function; 

import Function.Candy;
import Function.Checkout;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Checkout Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2018</pre> 
* @version 1.0 
*/ 
public class CheckoutTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: numberOfItems() 
* 
*/ 
@Test
public void testNumberOfItems() throws Exception { 
//TODO: Test goes here...
    Checkout checkout = new Checkout();
    int res =checkout.numberOfItems();
    Assert.assertEquals(0,res);
} 

/** 
* 
* Method: enterItem(Dessertitem item) 
* 
*/ 
@Test
public void testEnterItem() throws Exception { 
//TODO: Test goes here...
} 

/** 
* 
* Method: clear() 
* 
*/ 
@Test
public void testClear() throws Exception { 
//TODO: Test goes here...
} 

/** 
* 
* Method: totalCost() 
* 
*/ 
@Test
public void testTotalCost() throws Exception { 
//TODO: Test goes here...
    Checkout checkout = new Checkout();
    int res =checkout.totalCost();
    Assert.assertEquals(0,res);
} 

/** 
* 
* Method: totalTax() 
* 
*/ 
@Test
public void testTotalTax() throws Exception { 
//TODO: Test goes here...
    Checkout checkout = new Checkout();
    int res =checkout.totalTax();
    Assert.assertEquals(0,res);
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here...
    Checkout checkout = new Checkout();
    String res =checkout.toString();
    Assert.assertEquals("M & M Dessert Shoppe\n" +
            "     --------------------",res);
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
