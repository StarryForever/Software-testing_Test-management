package util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyArrayStackTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPush() {
		MyArrayStack teststack=new MyArrayStack();
		Integer i1=new Integer(1);
		Integer i2=new Integer(2);
		Integer i3=new Integer(3);
		teststack.push(i1);
		teststack.push(i2);
		teststack.push(i3);
		assertEquals(3,teststack.size());
		
	}

	@Test
	public void testPop() {
		MyArrayStack teststack=new MyArrayStack();
		Integer i1=new Integer(1);
		Integer i2=new Integer(2);
		Integer i3=new Integer(3);
		teststack.push(i1);
		teststack.push(i2);
		teststack.push(i3);
		teststack.pop();
		assertEquals(2,teststack.size());
	}

	@Test
	public void testGet() {
		MyArrayStack teststack=new MyArrayStack();
		Integer i1=new Integer(1);
		Integer i2=new Integer(2);
		teststack.push(i1);
		teststack.push(i2);
		assertEquals(2,teststack.get());
	}

}
