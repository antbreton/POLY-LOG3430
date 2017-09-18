package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorTestVerticeCount {

	@Test
	public void testBinaryTree() {
		Graph g = GraphGenerator.binaryTree(2);

		assertEquals("Test de nombbre de sommets", 2, g.V());
	}

	@Test
	public void testBipartite() {
		Graph g = GraphGenerator.bipartite(4, 3, 0.2);

		assertEquals("Test de nombbre de sommets", 7, g.V());
	}
	
	@Test
	public void testBipartite2() {
		Graph g = GraphGenerator.bipartite(6, 2, 3);

		assertEquals("Test de nombbre de sommets", 8, g.V());
	}
	
	
	@Test
	public void testComplete() {
		Graph g = GraphGenerator.complete(8);

		assertEquals("Test de nombbre de sommets", 8, g.V());
	}

	@Test
	public void testCompleteBipartite() {
		Graph g = GraphGenerator.completeBipartite(3,5);

		assertEquals("Test de nombbre de sommets", 8, g.V());
	}
	
	@Test
	public void testCycle() {
		Graph g = GraphGenerator.cycle(8);

		assertEquals("Test de nombbre de sommets", 8, g.V());
	}
	
	@Test
	public void testEulerianCycle() {
		Graph g = GraphGenerator.eulerianCycle(8, 3);

		assertEquals("Test de nombbre de sommets", 8, g.V());
	}
	
	@Test
	public void testEulerianPath() {
		Graph g = GraphGenerator.eulerianPath(6,2);

		assertEquals("Test de nombbre de sommets", 6, g.V());
	}


}
