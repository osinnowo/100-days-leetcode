class Solution {
    static Set<Character> set = new HashSet<Character>();
    static {
        set.add('(');
        set.add(')');
        set.add('{');
        set.add('}');
        set.add('[');
        set.add(']');
    }
    
    public boolean isValid(String s) {
        if(s.length() <= 1) { return false; }
        char[] characters = s.toCharArray();
        int index = 0;
        while(index <= characters.length - 2) {
            char currentCharacter = characters[index];
            char nextCharacter = characters[index + 1];
            switch(currentCharacter) {
                case '(':
                    if(nextCharacter != ')') {
                        return false;
                    }
                    break;
                case '{':
                    if(nextCharacter != '}') {
                        return false;
                    }
                    break;
                case '[':
                     if(nextCharacter != ']') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            index += 2;
        }
        return true;
    }
}