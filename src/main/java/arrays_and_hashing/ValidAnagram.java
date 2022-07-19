package arrays_and_hashing;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 *
 * Given two strings "s" and "t", return true if "t" is an anagram of "s" and false otherwise
 *
 * EXAMPLE 1:
 * input: s = "anagram" t = "nagaram"
 * output: true
 *
 * EXAMPLE 2:
 * input: s = "rat" , t = "car"
 * output: false
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/">Contains Duplicate</a>
 */

public class ValidAnagram {

    /**
     * Alternative more understandable solution to ValidAnagram
     *
     * Simple bruteforce approach: sort the strings and compare the characters
     *
     * @param s
     * @param t
     * @return true
     * @return false
     * @return false
     */
    public boolean isAnagram(String s, String t){

        //check length of both string parameters
        //if they're not equal length the string CANNOT be anagrams
        if (s.length() != t.length()) return false;

        //convert the strings to a char array
        //this will allow us to loop through each character for comparison
        char[] tempArrayS = s.toCharArray();
        char[] tempArrayT = t.toCharArray();

        //sort the temporary arrays
        //it will be easier to compare the characters if they're in the same alphabetical order
        Arrays.sort(tempArrayS);
        Arrays.sort(tempArrayT);

        //loop through the arrays (strings)
        for(int i = 0; i < s.length(); i++){
            //check each character at the current position in the loop
            //because the arrays are sorted each letter should be identical unless they are NOT anagrams
            if(tempArrayS[i] != tempArrayT[i]) return false;
        }
        //no errors were found return true
        return true;
    }
}
