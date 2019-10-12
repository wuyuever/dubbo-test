package com.cmsz.wy.pattern.flyweight.model;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testBigChar {
	private static BigChar bigchar;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		bigchar = new BigChar('1');
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void test() {
		Iterator iter = bigchar.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
