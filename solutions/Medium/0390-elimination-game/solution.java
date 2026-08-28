// ──────────────────────────────────────────────────
// Problem  : 390. Elimination Game
// Difficulty: Medium
// Tags     : Math, Recursion
// Link     : https://leetcode.com/problems/elimination-game/
// Runtime  : 2 ms (beats 94%)
// Memory   : 43568000 (beats 25%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int lastRemaining(int n) {
        boolean left=true;
        return calc(n,left);
    }
    public int calc(int n, boolean left){
        if(n==1){
            return 1;
        }
        if(left){
            return 2*calc(n/2,false); 
            //if left to right, then elements from 1 to n will be processed
            //1 will be removed, then 3, then 5, ...
            //so the remaining are 2,4,6,...
            //this is basically 2*(1,2,3,...) and the ranges is now n/2
            //keep this in mind
        }else{
            //now in right to left, elements from n to 1 will be processed, and this makes 2 cases
            //earlier in left to right, we didnt get this case because n/2(gives floor of odd) adjusted our range to even 
            //and 2 * range gave the result
            //basically, 1st element is removed no matter the n and last even element is always left out because of
            //floor value returned by n/2
            //but we will get cases for below now
            if(n%2==0){
                //if our n is even and we are removing right to left, then first is always left out
                //but what we keep doing is 2 * range/2
                //so we need to subtract 1 to get the first element.
                //try to relate this to left to right
                //there also, we always skipped first element because it would be deleted no matter what
                //however here, first is getting left out, so u have to handle that by subtracting to reach the first element
                return 2*calc(n/2,true)-1;
            }else{
                //otherwise if n is odd, then you dont have to worry
                //both first and last element will be removed no matter what
                //and this makes it similar to our left to right case
                //so just return how you did there
                return 2*calc(n/2,true);
            }
        }
    }
}