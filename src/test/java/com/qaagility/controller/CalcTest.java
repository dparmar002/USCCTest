package com.qaagility.controller;

import com.qaagility.javaee.Calmul;
import com.qaagility.javaee.*;

import org.junit.Test;
import static org.junit.Assert.AssertEquals;
 
public class CalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }

	@Test
	public void Test111() 
	{

	Calcmul pp=new Calcmul();
	Calculator cl=new Calculator();
		int res=pp.mul();
		int res1=cl.add();
			assertEquals("Result - Fail",18,res);
			assertEquals(pp.mul(),18);
			assertEquals(cl.add(),9);
	}
	
	}



