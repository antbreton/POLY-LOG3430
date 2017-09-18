package testjunit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorTest {

	
	@Test
	public void testBinaryTree() {
		Graph g = GraphGenerator.binaryTree(2);
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "binaryTree", g.getTypeName());

	}

	@Test
	public void testBipartite() {
		Graph g = GraphGenerator.bipartite(4, 3, 0.2);
		
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "bipartite", g.getTypeName());

	}
	
	@Test
	public void testBipartite2() {
		Graph g = GraphGenerator.bipartite(6, 2, 3);
		
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "bipartite", g.getTypeName());

	}
	
	
	@Test
	public void testComplete() {
		Graph g = GraphGenerator.complete(8);
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "complete", g.getTypeName());
	}

	@Test
	public void testCompleteBipartite() {
		Graph g = GraphGenerator.completeBipartite(3,5);
		
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "completeBipartite", g.getTypeName());
	}
	
	@Test
	public void testCycle() {
		Graph g = GraphGenerator.cycle(8);
		
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "cycle", g.getTypeName());
	}
	
	@Test
	public void testEulerianCycle() {
		Graph g = GraphGenerator.eulerianCycle(8, 3);
		
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "eulerianCycle", g.getTypeName());
	}
	
	@Test
	public void testEulerianPath() {
		Graph g = GraphGenerator.eulerianPath(6,2);
		
		//assertEquals("Test de type", "", g.getTypeName());
		assertEquals("Test de type",  "eulerianPath", g.getTypeName());
	}

}
