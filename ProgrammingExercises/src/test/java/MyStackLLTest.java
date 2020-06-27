import org.junit.Assert;
import org.junit.Test;

public class MyStackLLTest {

	@Test
	public void isEmptyTest() {
        MyStackLL stack = new MyStackLL();
		Assert.assertTrue(stack.isEmpty());
	}
	
    @Test
    public void pushTest() {
        MyStackLL stack = new MyStackLL();
        stack.push(1);
		Assert.assertTrue(!stack.isEmpty());
    }

    @Test
    public void peekTest() throws Exception {
        MyStackLL stack = new MyStackLL();
        stack.push(1);
        stack.push(2);
        stack.pop();
		Assert.assertEquals(1, stack.peek());
    }
    
    @Test
    public void popTest() throws Exception {
        MyStackLL stack = new MyStackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
		Assert.assertEquals(3, stack.pop());
    }
    
    @Test
    public void callPrintStack() {
        MyStackLL stack = new MyStackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack(); //Console output --> 3 2 1 
    }
    
    @Test(expected=Exception.class)
    public void popTestExceptionIfStackEmpty() throws Exception {
        MyStackLL stack = new MyStackLL();
        stack.pop();
    }
}
