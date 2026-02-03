//import java.beans.Transient;
import org.junit.*;

public class multiplyTest 
{
    @Test
    public void test1formultiply()
    {
        multiply mul_var = new multiply();
        Assert.assertEquals(6, mul_var.mult(2,3));
        Assert.assertEquals(10, mul_var.mult(2,5));
        Assert.assertEquals(0, mul_var.mult(0,1));
    }    
}
