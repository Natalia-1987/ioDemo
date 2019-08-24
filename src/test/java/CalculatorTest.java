import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

   @BeforeClass
   public void setUp(){

   }

    @Test
    public void sumVerification(){

        assertEquals(3,calculator.sum(1,2));
    }

    @Test
    public void sumVerificationZero(){
        assertEquals(17,calculator.sum(17,0));
    }

    @Test (timeout = 10)
    public void multiplyVerification(){
        try {
            Thread.sleep(11);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(48,calculator.sum(3,45));
    }


    @Test
    public void multiplyVerificationZero(){
        assertEquals(0,calculator.sum(0,7));
    }

}
