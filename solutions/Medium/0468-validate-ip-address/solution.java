// ──────────────────────────────────────────────────
// Problem  : 468. Validate IP Address
// Difficulty: Medium
// Tags     : String
// Link     : https://leetcode.com/problems/validate-ip-address/
// Runtime  : 5 ms (beats 11%)
// Memory   : 43236000 (beats 13%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return isIPv4(queryIP) ? "IPv4" : "Neither";
        } else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            return isIPv6(queryIP) ? "IPv6" : "Neither";
        } else {
            return "Neither";
        }
    }

    private boolean isIPv4(String ip) {
        String[] parts = ip.split("\\.", -1);
        if (parts.length != 4) return false;
        for (String p : parts) {
            if (p.length() == 0 || (p.length() > 1 && p.charAt(0) == '0')) return false;
            try {
                int val = Integer.parseInt(p);
                if (val < 0 || val > 255) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    private boolean isIPv6(String ip) {
        String[] parts = ip.split(":", -1);
        if (parts.length != 8) return false;
        for (String p : parts) {
            if (p.length() == 0 || p.length() > 4) return false;
            for (char c : p.toCharArray()) {
                if (!Character.isDigit(c) && !"abcdefABCDEF".contains("" + c)) return false;
            }
        }
        return true;
    }
}
