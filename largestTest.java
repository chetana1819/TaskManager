import org.junit.*;
public class largestTest {
    @Test 
    public void demotest(){
        LargestNumber ob = new LargestNumber();
        Assert.assertEquals(7,ob.findlargest(7, 5));
        // Assert.assertEquals(5,ob.findlargest(7, 5));
        Assert.assertEquals(47,ob.findlargest(4, 47));
    }
}

