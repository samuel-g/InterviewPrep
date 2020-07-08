import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Note that an empty string is also considered
 * valid.
 * 
 * @author samue
 *
 */
public class ValidParentheses {
//"()"
	public boolean checkValidity(String s) {
		Stack<Character> stack = new Stack<Character>();

		// k, v pair map; k - open parenthesis, value - closed parenthesis
		HashMap<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// Check Opening
			if (mappings.containsValue(c)) {
				stack.push(c);
			} else { // Check Closing
				char topElement = stack.empty() ? '#' : stack.pop();
				if (topElement != mappings.get(c)) { // get closing branch
					return false;
				}

			}
		}

		return stack.isEmpty();
	}

}
