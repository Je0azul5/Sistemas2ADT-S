package Stack;

public class Balanceo {

	static boolean parejas(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	/*
	 * Return true if expression has balanced Parenthesis
	 */
	static boolean Balanceo(String exp) {
		/* Declare an empty character stack */
		Stack st = new ArrayStack();
		/*
		 * Traverse the given expression to check matching parenthesis
		 */
		for (int i = 0; i < exp.length(); i++) {

			/*
			 * If the exp[i] is a starting parenthesis then push it
			 */
			if (exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[')
				st.push(exp.charAt(i));
			/*
			 * If exp[i] is an ending parenthesis then pop from stack and check if the
			 * popped parenthesis is a matching pair
			 */
			if (exp.charAt(i) == '}' || exp.charAt(i) == ')' || exp.charAt(i) == ']') {
				/*
				 * If we see an ending parenthesis without a pair then return false
				 */
				if (st.empty()) {
					return false;
				}
				/*
				 * Pop the top element from stack, if it is not a pair parenthesis of character
				 * then there is a mismatch. This happens for expressions like {(})
				 */
				else if (!parejas((char) st.pop(), exp.charAt(i))) {
					return false;
				}
			}
		}

		/*
		 * If there is something left in expression then there is a starting parenthesis
		 * without a closing parenthesis
		 */

		if (st.empty())
			return true; /* balanced */
		else { /* not balanced */
			return false;
		}
	}

}
