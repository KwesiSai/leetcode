class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        
        Stack<Character> matchStack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(brackets.containsKey(ch)){
                char top = matchStack.isEmpty() ? '#' : matchStack.pop();

                if(top != brackets.get(ch)){
                    return false;
                }
            }
            else{
                matchStack.push(ch);
            }
        }
        return matchStack.isEmpty();
    }
}
