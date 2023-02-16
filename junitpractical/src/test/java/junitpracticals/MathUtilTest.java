package junitpracticals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilTest {
	
	
		
		@Test
		public void test() 
		{
			MathUtil m= new MathUtil();
			int expected = 3;
			int actual = m.add(2, 1);
			assertEquals(expected, actual);
			
			
		}
		
		@Test
		public void test1() 
		{
			MathUtil m= new MathUtil();
			int expected = 3;
			int actual = m.sub(5, 2);
			assertEquals(expected, actual);
		}
		
		@Test
		public void test2() 
		{
			MathUtil m= new MathUtil();
			int expected = 6;
			int actual = m.mul(3, 2);
			assertEquals(expected, actual);
		}
		
		@Test
		public void test3() 
		{
			MathUtil m= new MathUtil();
			int expected = 4;
			int actual = m.div(8, 2);
			assertEquals(expected, actual);
		}

	

}
