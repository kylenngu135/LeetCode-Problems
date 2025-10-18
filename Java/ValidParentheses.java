class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int size = stack.size();
            switch (s.charAt(i)) {
                case ')':
                    if (size == 0) {
                        return false;
                    }
                    if (stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (size == 0) {
                        return false;
                    }
                    if (stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (size == 0) {
                        return false;
                    }
                    if (stack.pop() != '[') {
                        return false;
                    }   
                    break;
                default:
                    stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
