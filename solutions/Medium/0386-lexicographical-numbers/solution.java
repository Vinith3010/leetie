// ──────────────────────────────────────────────────
// Problem  : 386. Lexicographical Numbers
// Difficulty: Medium
// Tags     : Depth-First Search, Trie
// Link     : https://leetcode.com/problems/lexicographical-numbers/
// Runtime  : 5 ms (beats 67%)
// Memory   : 50076000 (beats 66%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> lexicalOrder(int n) {
    List<Integer> al = new  ArrayList<>();
    int curr = 1; 
    for(int i=1; i<=n; i++)
    {
      al.add(curr);
      if(curr*10<=n)
      curr = curr*10;
      else
      {
        while(curr%10==9 || curr>=n)
        {
          curr = curr/10;   
        } 
        curr += 1;
      }
    } 
    return al;

    }
}