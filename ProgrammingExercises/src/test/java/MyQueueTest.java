import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void isEmptyTest() {
		MyQueue myQueue =  new MyQueue(3);
		Assert.assertTrue(myQueue.isEmpty());
	}
	
	@Test(expected = Exception.class)
	public void isFullTest() throws Exception {
		MyQueue myQueue =  new MyQueue(3);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
	}
	
    @Test
    public void enQueueTest() throws Exception {
        MyQueue myQueue =  new MyQueue(3);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        Assert.assertEquals(1, myQueue.arr[0]);        
    }
    
    @Test
    public void deQueueTest() throws Exception {
        MyQueue myQueue =  new MyQueue(1);
        myQueue.enQueue(1);
        myQueue.deQueue();
        myQueue.enQueue(1);
        myQueue.deQueue();
        Assert.assertTrue(myQueue.isEmpty());        
    }

}
