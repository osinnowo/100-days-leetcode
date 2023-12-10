class Solution {
    private static Map<String, Integer> map = new HashMap<>();
    
    static {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("5", 500);
        map.put("M", 1000);
    }
    
    //i.e. LVIII
    //.    MCMXCIV
    int result = 0;
    
    public int romanToInt(String s) {
        int index = 0;
        while(index < s.length()) {
            String initialSymbol = s.substring(index, index + 1);
            Integer initialValue = map.get(initialSymbol);
            
            Integer nextValue = 0;
            
            if((index + 1) < s.length()) {
                String nextSymbol = s.substring(index + 1, index + 2);
                nextValue = map.get(nextSymbol);
            }
            
            if(initialValue >= nextValue) {
               result += initialValue;
            } else if (initialValue < nextValue){
                result += (nextValue - initialValue);
                index += 1;
            }
            index++;
        }
        return result;
    }
    