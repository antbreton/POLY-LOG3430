package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

public class GraphGeneratorACTests {

	//V0 V'0 P0 ==> Erreur
	@Test
	public void testB3() {
		int V1 = -1; 
		int V2 = -2;
		double p = 2;
		try{
			Graph g = GraphGenerator.bipartite(-1,-2,2);
			fail(" Number of vertices can't be negative");
		}catch(Exception e){
			
		}
	}
	
	//V0 V'0 p
	@Test
	public void testB4(){
		int V1 = -4; 
		int V2 = -8;
		double p = 0.5;
		try{
			Graph g = GraphGenerator.bipartite(-4,-8,0.5);
			fail("Number of vertices can't be negative");
		}catch(Exception e){}
	}

	@Test
	public void testB5(){
		int V1 = -2; 
		int V2 = 15;
		double p = -2;
		try{
			Graph g = GraphGenerator.bipartite(-2,15,-2);
			fail(" Probability p must be between 0 and 1");
		}catch(Exception e){}
	}
	
	@Test
	public void testB6(){
		int V1 = 0;
		int V2 = 20; 
		int sommeV = V1+V2;
		double p = 0.1;
		Graph g = GraphGenerator.bipartite(V1, V2, p);
		assertEquals(sommeV, g.V());
	}
	
	@Test
	public void testB7(){
		int V1 = 12; 
		int V2 = -12;
		double p = 4;
		try{
			Graph g = GraphGenerator.bipartite(V1,V2,p);
			fail("Number of vertices can't be negative");
		}catch(Exception e){}
	}
	
	@Test
	public void testB8(){
		int V1 = 25;
		int V2 = 0; 
		int sommeV = V1+V2;
		double p = 0.9;
		Graph g = GraphGenerator.bipartite(V1, V2, p);
		assertEquals(sommeV, g.V());
	}
	
	@Test
	public void testB9(){
		int V1 = 50; 
		int V2 = 100;
		double p = 5;
		try{
			Graph g = GraphGenerator.bipartite(V1, V2, p);
			fail("Probability p must be between 0 and 1 (p>1)");
		}catch(Exception e){}		
	}
	
	@Test
	public void testB10(){
		int V1 = 300;
		int V2 = 250; 
		int sommeV = V1+V2;
		double p = 0.75;
		Graph g = GraphGenerator.bipartite(V1, V2, p);
		assertEquals(sommeV, g.V());
	}

	@Test
	public void testR3(){
		int V=-3;
		int k=-1; 
		try{
			Graph g = GraphGenerator.regular(V, k); 
			fail("Number of vertice V can't be negative");
		}catch(Exception e){}
	}

	@Test
	public void testR4(){
		int V=-2;
		int k=2;
		try {
			Graph g = GraphGenerator.regular(V, k);
			fail("Number of vertice V can't be negative");
			}catch(Exception e){}
	}
	
	@Test
	public void testR5(){
		try{
			int V=13;
			int k=-5;
			Graph g = GraphGenerator.regular(V, k);
			fail("Degres k can't be negative");
		}catch(Exception e){}
	}
	
	@Test
	public void testR6(){
		int V = 15; 
		int k = 4;
		Graph g = GraphGenerator.regular(V, k);
		assertEquals(V, g.V());
	}
}
