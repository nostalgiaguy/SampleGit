package com.nostalgiaguy.junitcoreconcept;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitOrderTest {
	
	@BeforeClass
	public static void beforeSuite() {
		System.out.println("********BEFORE SUITE**********");
	}
	
	@Test
	public void test_C() {
		System.out.println("************TEST C************");
	}
	
	@Test
	public void test_B() {
		System.out.println("************TEST B************");
	}
	
	@Test
	public void test_A() {
		System.out.println("************TEST A************");
	}
	
	@Test
	public void test_D() {
		System.out.println("************TEST D************");
	}
	
	@AfterClass
	public static void afterSuite() {
		System.out.println("********AFTER SUITE***********");
	}

}
