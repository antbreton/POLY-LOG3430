package testjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import edu.princeton.cs.algs4.Queue;

public class QueueTest {

	/*
	 * Tests the first tranch : S1 -> exit with its differents causes
	 */
	
	// Cause 1 : peek on an emptyList
	@Test
	public void s1ToExit1(){
		try{
			Queue q = new Queue();
			q.peek();
			fail("Cannot peek on an empty Queue");
		}catch(Exception e){}	
	}
	
	// Cause 2 : peek on an emptyList
	@Test
	public void s1ToExit2(){
		try{
			Queue q = new Queue();
			q.dequeue();
			fail("Cannot dequeue an empty Queue");
		}catch(Exception e){}	
	}

	
	/*
	 * Tests the second tranch : S1 -> S2 -> S1 
	 * Occurs if [size == 1]
	 */
	@Test
	public void s1S2S1 (){
		Queue q = new Queue();
		String item = "itemToAdd";
		q.enqueue(item);
		q.dequeue();
		Assert.assertEquals(0, q.size()); 
	}
	
	/*
	 * Tests the third tranch : S1 -> S2 -> S2
	 */
	// Occurs if [size >= 1]
	@Test
	public void s1S2S2ByPeek (){
		Queue q = new Queue();
		String item1 = "item1ToAdd";
		q.enqueue(item1);		
		q.peek();
		Assert.assertEquals(1, q.size()); 
	}
	
	// Occurs if size > 1
	@Test
	public void s1S2S2ByDequeue (){
		Queue q = new Queue();
		String item1 = "item1ToAdd";
		String item2 = "item2ToAdd";
		q.enqueue(item1);		
		q.enqueue(item2);
		q.dequeue();
		Assert.assertEquals(1, q.size()); 
	}
}
