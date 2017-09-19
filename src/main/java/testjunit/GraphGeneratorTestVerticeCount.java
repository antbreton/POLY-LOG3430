package testjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorTestVerticeCount {

	@Test
	public void testBinaryTree() {
		Graph g = GraphGenerator.binaryTree(2);
		assertEquals("Test du nombre de sommets pour BinaryTree", 2, g.V());
	}

	@Test
	public void testBipartite() {
		Graph g = GraphGenerator.bipartite(4, 3, 0.2);
		assertEquals("Test du nombre de sommets pour Bipartite", 7, g.V());
	}
	
	@Test
	public void testBipartite2() {
		Graph g = GraphGenerator.bipartite(6, 2, 3);
		assertEquals("Test du nombre de sommets pour Bipartite2", 8, g.V());
	}

	@Test
	public void testComplete() {
		Graph g = GraphGenerator.complete(8);
		assertEquals("Test du nombre de sommets pour Complete", 8, g.V());
	}

	@Test
	public void testCompleteBipartite() {
		Graph g = GraphGenerator.completeBipartite(3,5);
		assertEquals("Test du nombre de sommets pour Complete Bipartite ", 8, g.V());
	}
	
	@Test
	public void testCycle() {
		Graph g = GraphGenerator.cycle(8);
		assertEquals("Test du nombre de sommets pour Cycle", 8, g.V());
	}
	
	@Test
	public void testEulerianCycle() {
		Graph g = GraphGenerator.eulerianCycle(8, 3);
		assertEquals("Test du nombre de sommets pour Euleriean Cycle", 8, g.V());
	}
	
	@Test
	public void testEulerianPath() {
		Graph g = GraphGenerator.eulerianPath(6,2);
		assertEquals("Test du nombre de sommets pour Eulerian Path", 6, g.V());
	}

	@Test
	public void testSimpleIntInt() {
		Graph g = GraphGenerator.simple(3,2);
		assertEquals("Test du nombre de sommets pour Simple (Int, Int)", 3, g.V());
	}

	@Test
	public void testSimpleIntDouble() {
		Graph g = GraphGenerator.simple(5, 0.5);
		assertEquals("Test du nombre de sommets pour Simple (Double) ",5, g.V());
	}

	@Test
	public void testPath() {
		Graph g = GraphGenerator.path(4);
		assertEquals("Test du nombre de sommets pour Path", 4, g.V());
	}

	@Test
	public void testWheel() {
		Graph g = GraphGenerator.wheel(5);
		assertEquals("Test du nombre de sommets pour Wheel", 5, g.V());
	}

	@Test
	public void testStar() {
		Graph g = GraphGenerator.star(3);
		assertEquals("Test du nombre de sommets pour Star",3, g.V());
	}

	@Test
	public void testRegular() {
		Graph g = GraphGenerator.regular(5, 2);
		assertEquals("Test du nombre de sommets pour Regular",5 , g.V());
	}

	@Test
	public void testTree() {
		Graph g = GraphGenerator.tree(3);
		assertEquals("Test du nombre de sommets pour Tree",3,  g.V());
	}
}
