import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReorderDatainLogFilesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testorderLogs() {
		
		String[] expecteds = {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		Assert.assertArrayEquals(expecteds, new ReorderDatainLogFiles().orderLogs(logs));
		
	}

}
