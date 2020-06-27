import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

	private MyStack stack;

	@Test
	public void isEmptyTest() {
		stack = new MyStack(0);
		Assert.assertTrue(stack.isEmpty());
	}

	@Test
	public void isFullTest() throws Exception {
		stack = new MyStack(3);
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		Assert.assertTrue(stack.isFull());
		stack = new MyStack(3);
		stack.push("One");
		Assert.assertFalse(stack.isFull());
	}

	@Test
	public void pushTest() throws Exception {
		stack = new MyStack(3);
		Assert.assertEquals("one", stack.push("one"));
	}

	@Test
	public void popTest() throws Exception {
		stack = new MyStack(3);
		stack.push("one");
		stack.push("two");
		Assert.assertEquals("two", stack.pop());
	}

	@Test
	public void peekTest() throws Exception {
		stack = new MyStack(3);
		stack.push("one");
		stack.push("two");
		stack.push("three");
		Assert.assertEquals("three", stack.peek());
	}

	@Test(expected = Exception.class)
	public void exceptionWhenStackEmptyTest() throws Exception {
		stack = new MyStack(3);
		stack.pop();
	}

	@Test(expected = Exception.class)
	public void exceptionWhenStackFullTest() throws Exception {
		stack = new MyStack(1);
		stack.push("");
		stack.push("");
	}

}
