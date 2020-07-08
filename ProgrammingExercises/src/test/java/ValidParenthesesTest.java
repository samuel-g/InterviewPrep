import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(new ValidParentheses().checkValidity("()"));
		assertTrue(new ValidParentheses().checkValidity("()[]{}"));
		assertFalse(new ValidParentheses().checkValidity("(]"));
	}

}
