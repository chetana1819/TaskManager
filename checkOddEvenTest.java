// import java.beans.Transient;
import org.junit.*;

public class checkOddEvenTest {
    @Test 
    public void test1(){
        EvenOdd obj1=new EvenOdd();
        Assert.assertEquals(1,obj1.evenOdd(82));
        Assert.assertEquals(0,obj1.evenOdd(517));
        Assert.assertNotEquals(0,obj1.evenOdd(12));
    }
}
