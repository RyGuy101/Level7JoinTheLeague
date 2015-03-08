package org.jointheleague.duck;

import junit.framework.TestCase;

public class DuckTest extends TestCase
{

//	public void testWeCanCountTheNumberOfDucksCreated() throws Exception
//	{
//		assertEquals(0, Duck.getNumberOfCreations());
//		Duck duck1 = new Duck();
//		Duck duck2 = new Duck();
//		Duck duck3 = new Duck();
//		assertEquals(3, Duck.getNumberOfCreations());
//		Duck duck4 = new Duck();
//		assertEquals(4, Duck.getNumberOfCreations());
//	}
//
//	public void testZEverySecondDuckIsBlack() throws Exception
//	{
//		Duck duck1 = new Duck();
//		Duck duck2 = new Duck();
//		Duck duck3 = new Duck();
//		assertEquals("black", duck1.getColor());
//		assertEquals("white", duck2.getColor());
//		assertEquals("black", duck3.getColor());
//	}
	
	public void testZZOnlyOneInstanceOfDuck(){
		Duck.getDuck();
		assertEquals("black", Duck.getDuck().getColor());
		Duck.getDuck();
		assertEquals("black", Duck.getDuck().getColor());
	}

	 public void testEveryFourJellyfishArePoisonous() throws Exception
	 {
		 Jellyfish jelly1 = new Jellyfish();
		 assertEquals(false, jelly1.isPoisonous());
		 Jellyfish jelly2 = new Jellyfish();
		 assertEquals(false, jelly2.isPoisonous());
		 Jellyfish jelly3 = new Jellyfish();
		 assertEquals(false, jelly3.isPoisonous());
		 Jellyfish jelly4 = new Jellyfish();
		 assertEquals(true, jelly4.isPoisonous());
	 }
}

// Copyright, The League of Amazing Programmers 2015
