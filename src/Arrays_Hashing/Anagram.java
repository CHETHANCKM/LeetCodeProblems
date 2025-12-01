package Arrays_Hashing;

import java.util.Arrays;
import java.util.HashMap;

/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string,
but the order of the characters can be different.
 */
public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        CharArrayMethod(s, t);
        HashMapMethod(s, t);
    }

    /*
    HashMap:
        Time Complexity : O(s+t)
        
     */

    private static void HashMapMethod(String s, String t) {

        if (s.length() != t.length()) {
            System.out.println("Lengths not equal");
        }

        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0) + 1);
            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i), 0) + 1);
        }

        System.out.println(s_map.equals(t_map));
    }

    private static void CharArrayMethod(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        if (s_arr.length != t_arr.length) {
            System.out.println("Arrays are not equal");
        }

        boolean equal = Arrays.equals(s_arr, t_arr);
        System.out.println(equal);

    }



}
