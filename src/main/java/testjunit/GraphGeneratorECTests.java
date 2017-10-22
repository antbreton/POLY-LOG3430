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
	 */
	
	
	// S1 => V0 P0 [erreur]
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
	
	//	S2 => V1 P1
	@Test
	public void testS2() {
		Graph g = GraphGenerator.simple(12,0.05);

		// Test sur le nombre de sommets
		assertEquals(12, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(true, g.E()>=0 && g.E() <=4); 
	}
	
	// V0 V’0 p0 => error
		@Test
	public void testB1() {
		Graph g = GraphGenerator.bipartite(-1,-1,1.5);

		// Test sur le nombre de sommets
		assertEquals(12, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(true, g.E()>=0 && g.E() <=4); 
	}


	// V1 V’1 p1 => error
	@Test
	public void testB2() {
		Graph g = GraphGenerator.bipartite(-1,-1,1.5);

		// Test sur le nombre de sommets
		assertEquals(12, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(true, g.E()>=0 && g.E() <=4); 
	}	

	// v0 k0 => error	
	@Test
	public void testR1() {
		Graph g = GraphGenerator.regular(-1,-1);

		// Test sur le nombre de sommets
		assertEquals(12, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(true, g.E()>=0 && g.E() <=4); 
	}	
	
	// v1 k1 => regular (V1, k1)
	@Test
	public void testR2() {
		Graph g = GraphGenerator.regular(2,4);

		// Test sur le nombre de sommets
		assertEquals(12, g.V()); 
		
		// Test sur les probabilités d'ajout d'aretes
		assertEquals(true, g.E()>=0 && g.E() <=4); 
	}	
}
