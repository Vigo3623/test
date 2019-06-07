package aaa.bbb.ccc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase1 {
	@Test
	public void testSample(){
		int[] a=new int[] {1,2,3,4,5};
		assertEquals(15,getsum(a));
				}
	public static int getsum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}
