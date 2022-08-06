// Medium
// Given a palindromic string of lowercase English letters palindrome, 
// replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.

// Return the resulting string. 
// If there is no way to replace a character to make it not a palindrome, 
// return an empty string.

// A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, 
// a has a character strictly smaller than the corresponding character in b. 
// For example, 
// "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, 
// and 'c' is smaller than 'd'.

// Example 1:
// Input: palindrome = "abccba"
// Output: "aaccba"
  
// Explanation: 
// There are many ways to make "abccba" not a palindrome, 
// such as "zbccba", "aaccba", and "abacba".
// Of all the ways, 
// "aaccba" is the lexicographically smallest.
  
// Example 2:
// Input: palindrome = "a"
// Output: ""
  
// Explanation: 
// There is no way to replace a single character to make "a" not a palindrome, 
// so return an empty string.
 
// Constraints:
// 1 <= palindrome.length <= 1000
// palindrome consists of only lowercase English letters.
  
// Solution
class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() < 2) {
            return "";
        }
        
        char[] chArr = palindrome.toCharArray();
        boolean changed = false;
        
        for (int i = 0; i < chArr.length / 2; i++) {
            if (chArr[i] != 'a') {
                chArr[i] = 'a';
                changed = true;
                
                break;
            }
        }
        
        if (!changed) {
            chArr[palindrome.length() - 1] = 'b';
        }
        
        String ans = String.copyValueOf(chArr);
        
        return ans;
    }
}
// TC: O(n); SC: O(n)
// Success
// Details 
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Break a Palindrome.
// Memory Usage: 40.5 MB, less than 87.21% of Java online submissions for Break a Palindrome.