class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();

        hm.put('}','{');
        hm.put(']','[');
        hm.put(')','(');

        for(char c: s.toCharArray()){
            if(hm.containsValue(c)){
                st.push(c);
            }else if(hm.containsKey(c)){
                if(st.isEmpty() || st.pop() != hm.get(c)){
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}
