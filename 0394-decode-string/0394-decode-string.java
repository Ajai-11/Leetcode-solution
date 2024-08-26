class Solution {
    public String decodeString(String s) {
           Stack<StringBuilder> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                stringStack.push(currentString);
                countStack.push(currentNum);
                currentString = new StringBuilder();
                currentNum = 0;
            } else if (ch == ']') {
                StringBuilder temp = stringStack.pop();
                int repeatCount = countStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}