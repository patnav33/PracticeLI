package com.practice;

public class TestCasesOfFibo {
	public int fib(int n) {
		if (n <= 0)
			return 0;
		else
			return n + fib(--n);
	}
}

/*public class FibonacciTest {
	
	FibonacciSeries fs;
	
	@Before
	public void init(){
		fs = new FibonacciSeries();
	}
	
	@Test
	public void negativeInput(){
		assertEquals(0,fs.fib(-2));
	}
	
	@Test
	public void zeroAsInput(){
		assertEquals(0,fs.fib(0));
	}

	@Test
	public void oneAsInput(){
		assertEquals(1, fs.fib(1));
	}
	
	@Test
	public void getFibResult(){
		assertEquals(6, fs.fib(3));
	}
	
	
}*/