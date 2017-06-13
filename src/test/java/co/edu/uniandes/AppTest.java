package co.edu.uniandes;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(testName = "test")
public class AppTest 

{
    @Test(testName = "mytest")
    public void testFunc(){
        Assert.assertEquals(4,4);
    }

    @Test(testName = "mytes1")

    public void testFunc1(){
        Assert.assertEquals(4,3);
    }

}
