package testjunit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class BoiteBlanche {

	/*
	 * Bipartite
	 */
	
	@Test
	public void bipartite_0() {
		
		try
		{
			Graph g = GraphGenerator.bipartite(4,4,20);
			fail("Too many edges");
		}
		catch(Exception e )
		{
			
		}
	}
	
	@Test
	public void bipartite_1() {
		
		try
		{
			Graph g = GraphGenerator.bipartite(10,10,-1);
			Assert.fail();
		}
		catch(Exception e )
		{
			
		}
	}
	
	/*
	 * Simple
	 */
	@Test
	public void simple_0() {
		Graph g = GraphGenerator.simple(10,10);
		
		assertEquals(g.getTypeName(), "simple");
	}
	
	@Test
	public void simple_1() {
		
		try
		{
			Graph g = GraphGenerator.simple(10,100);
			fail();
		}
		catch(Exception e) {}
	}
	
	@Test
	public void simple_2() {
		
		try
		{
			Graph g = GraphGenerator.simple(10,-1);
			fail();
		}
		catch(Exception e) {}
	}
		
	@Test
	public void binaryTree_() {
		Graph g = GraphGenerator.binaryTree(10);
		
		assertEquals(g.getTypeName(), "binaryTree");
	}

	@Test
	public void complete_() {
		Graph g = GraphGenerator.complete(10);
		
		assertEquals(g.getTypeName(), "complete");
	}
	
	@Test
	public void completeBipartite_() {
		Graph g = GraphGenerator.completeBipartite(10,10);
		
		assertEquals(g.getTypeName(), "completeBipartite");
	}
	
	@Test
	public void path_() {
		Graph g = GraphGenerator.path(10);
		
		assertEquals(g.getTypeName(), "path");
	}
	
	/*
	 * Star 
	 */
	
	@Test
	public void star_0() {
		Graph g = GraphGenerator.star(10);
		
		assertEquals(g.getTypeName(), "star");
	}
	
	@Test
	public void star_1() {
		
		try
		{
			Graph g = GraphGenerator.star(0);
			fail();
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Test
	public void cycle_() {
		Graph g = GraphGenerator.cycle(10);
		
		assertEquals(g.getTypeName(), "cycle");
	}
	
	/*
	 * euleriqnCycle
	 */
	@Test
	public void eulerianCycle_() {
		Graph g = GraphGenerator.eulerianCycle(10,20);
		
		assertEquals(g.getTypeName(), "eulerianCycle");
	}
	@Test
	public void eulerianCycle_1() {
		
		try
		{
			Graph g = GraphGenerator.eulerianCycle(10,-1);
			fail();
		}
		catch(Exception e) {}
	}
	
	@Test
	public void eulerianCycle_2() {
		
		try
		{
			Graph g = GraphGenerator.eulerianCycle(0,10);
			fail();
		}
		catch(Exception e) {}
	}
	
	/*
	 * EulerianPath
	 */
	@Test
	public void eulerianPath_() {
		Graph g = GraphGenerator.eulerianPath(10,15);
		
		assertEquals(g.getTypeName(), "eulerianPath");
	}
	
	@Test
	public void eulerianPath_1() {
		
		try
		{
			Graph g = GraphGenerator.eulerianPath(10,-1);
			fail();
		}
		catch(Exception e) {}
	}
	
	@Test
	public void eulerianPath_2() {
		
		try
		{
			Graph g = GraphGenerator.eulerianPath(0,10);
			fail();
		}
		catch(Exception e) {}
	}
	/*
	 * wheel
	 */
	@Test
	public void wheel_0() {
		Graph g = GraphGenerator.wheel(10);
		
		assertEquals(g.getTypeName(), "wheel");
	}
	
	@Test
	public void wheel_1() {
		
		try
		{
			Graph g = GraphGenerator.wheel(0);
			fail();
		}
		catch(Exception e)
		{
			
		}
	}
	

	
	/*
	 * tree 
	 */
	@Test
	public void tree_0() {
		Graph g = GraphGenerator.tree(10);
		
		assertEquals(g.getTypeName(), "tree");
	}
	
	@Test
	public void tree_1() {
		Graph g = GraphGenerator.tree(1);
		
		assertEquals(g.getTypeName(), "tree");
	}
}
