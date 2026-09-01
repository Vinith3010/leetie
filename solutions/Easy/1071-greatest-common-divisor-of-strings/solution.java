// ──────────────────────────────────────────────────
// Problem  : 1071. Greatest Common Divisor of Strings
// Difficulty: Easy
// Tags     : Math, String, Euclidean Algorithm, Greatest Common Divisor
// Link     : https://leetcode.com/problems/greatest-common-divisor-of-strings/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43852000 (beats 16%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String gcdOfStrings(String str1, String str2) {
         if(str2.length()>str1.length()){
            return gcdOfStrings(str2, str1);
         }
         if(str2.equals(str1)){
            return str1;
         }
         if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
         }
         return "";
}
}