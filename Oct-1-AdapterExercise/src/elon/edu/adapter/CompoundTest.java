package elon.edu.adapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompoundTest {
	Compound c;
	
	@Before
	public void setUp() throws Exception {
		c = new Compound("Water");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDisplay() {
		
	}

	@Test
	public void testGetBoilingPoint() {
		double boil = c.getBoilingPoint();
		assertEquals(boil, 100.0,.1);
	}

	@Test
	public void testGetMeltingPoint() {
		double melt = c.getMeltingPoint();
		assertEquals(melt, 0.0, .1);
	}

	@Test
	public void testGetMolecularFormula() {
		String form = c.getMolecularFormula();
		assertEquals(form, "H2O");
	}

	@Test
	public void testGetMolecularWeight() {
		double weight = c.getMolecularWeight();
		assertEquals(weight, 18.015, .1);
	}

}
