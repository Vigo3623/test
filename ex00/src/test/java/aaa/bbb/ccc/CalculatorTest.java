package aaa.bbb.ccc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Calc{
	public int eval(String ex) {
		int sum=0;
		for(String s:ex.split("\\+")) {
			sum+=Integer.valueOf(s);
	 }
		return sum;
	}
}
public class CalculatorTest {
	@Test
	public void evaEx() {
		Calc c=new Calc();
		int sum=c.eval("1+2+3");
		assertEquals(6,sum);
	}
}
