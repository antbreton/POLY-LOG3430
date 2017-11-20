package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Queue;

/*
 * Test cases for Queue class
 */
public class MadumTest {

	/*
	 * Test the first tranch of LAST attribute
	 * Queue -> getLast -> enqueue -> getLAst -> dequeue -> getLast
	 */	
	@Test
	public void firstTranchForLast() {

	}
	
	/*
	 * Test the second tranch of LAST attribute
	 * Queue -> getLast -> dequeue -> getLAst -> enqueue -> getLast
	 */
	@Test
	public void secondTranchForLast() {
	}

	/*
	 * Test the first tranch of N attribute
	 * Queue -> size -> enqueue -> size -> dequeue -> size
	 */
	@Test
	public void firstTranchForN() {
	}
	
	/*
	 * Test the second tranch of N attribute
	 * Queue -> size -> dequeue -> size -> enqueue -> size
	 */
	@Test
	public void secondTranchForN() {
	}
	
	/*
	 * Test the first tranch of FIRST attribute
	 * Queue -> peek -> enqueue -> peek -> dequeue -> peek
	 */
	@Test
	public void firstTranchForFirst() {
	}
	
	/*
	 * Test the second tranch of FIRST attribute
	 * Queue -> peek -> dequeue -> peek -> enqueue -> peek
	 */
	@Test
	public void secondTranchForFirst() {
	}
}
