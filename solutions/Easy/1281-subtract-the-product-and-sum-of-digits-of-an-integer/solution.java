// ──────────────────────────────────────────────────
// Problem  : 1281. Subtract the Product and Sum of Digits of an Integer
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42288000 (beats 27%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;   // extract last digit
            product *= digit;     // multiply into product
            sum += digit;         // add into sum
            n /= 10;              // remove last digit
        }

        return product - sum;
    }
}
