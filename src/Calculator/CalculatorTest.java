package Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import junit.framework.Assert;

public class CalculatorTest {
	@Test
    public void testAd() {
		Calculator a = new Calculator();
		int c=5;
		int b=5;
		int res = a.calc(c,b,'+');
		Assert.assertEquals(res, 10);
					
			}

		
	@Test (expected = ArithmeticException.class)
	public void testDel() {
		Calculator b1 = new Calculator();
		int x = 5;
		int y = 0;
			b1.calc(x, y, '/');

				
							}
	@Test
	public void testSub() {
		Calculator a = new Calculator();
		int a1=5;
		int b2=4;
		int res2 = a.calc(a1,b2,'-');
		Assert.assertEquals(res2, 1);
		
	}
		
		
	}
		
	

