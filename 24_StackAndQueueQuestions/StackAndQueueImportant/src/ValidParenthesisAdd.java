

// https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
import java.util.Stack;

public class ValidParenthesisAdd {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                // Check for double ')' sequence
                if (i < s.length() - 1 && s.charAt(i + 1) == ')') {
                    i++; // Skip the next ')'
                } else {
                    insertions++; // Need an extra ')' to balance this single ')'
                }

                if (stack.isEmpty()) {
                    insertions++; // Need an extra '(' to balance
                } else {
                    stack.pop(); // Balanced with a '(' from the stack
                }
            }
        }

        // Each remaining '(' needs two ')'
        insertions += 2 * stack.size();

        return insertions;
    }

    public static void main(String[] args) {
        ValidParenthesisAdd solution = new ValidParenthesisAdd();
        String s = "))())(";
        System.out.println("Minimum insertions needed: " + solution.minInsertions(s)); // Output: 1
    }
}
