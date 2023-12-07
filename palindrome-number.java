import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        String item = String.valueOf(x);
        char[] items = item.toCharArray();
        int left = 0;
        int right = items.length - 1;
        while(left < right) {
            if(items[left] != items[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}