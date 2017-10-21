package testjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorECTests {

	/*
	 * La description des tests est écrite sur le rapport. Tous les tests ici
	 * présents sont nommés test + numéro de test. Pour voir leur description,
	 * il suffit de consulter les tableaux des trames de tests.
	 * 
	 * S1 => V0 P0 [erreur]
	 * 
	 * S2 => V1 P1
	 * 
	 * 
	 * S3 => V2 P2
	 * 
	 * 
	 * S4 => V3 P3
	 * 
	 * 
	 * S5 => V3 P4
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void testS1() {
		try
		{
			Graph g = GraphGenerator.simple(0,-1);
			fail("Negative probability should raise an exception");
		}
		catch (Exception e)
		{
			
		}
	}

	@Test
	public void testS2() {
		Graph g = GraphGenerator.simple(12,0.05);

		// Test sur le nombre de sommets
		assertEquals(12, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(true, g.E()>=0 && g.E() <=4); 
	}
	
	@Test
	public void testS3() {
		Graph g = GraphGenerator.simple(50,0.6);
		
		// Test sur le nombre de sommets
		assertEquals(50, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		//assertEquals(5, g.E());
		assertEquals(true, g.E()>=600 && g.E() <=800); 
	}
	
	@Test
	public void testS4() {
		Graph g = GraphGenerator.simple(300,1.0);
		
		// Test sur le nombre de sommets
		assertEquals(300, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(44850, g.E()); 
	}
}
