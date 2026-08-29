// ──────────────────────────────────────────────────
// Problem  : 535. Encode and Decode TinyURL
// Difficulty: Medium
// Tags     : Hash Table, String, Design, Hash Function
// Link     : https://leetcode.com/problems/encode-and-decode-tinyurl/
// Runtime  : 6 ms (beats 11%)
// Memory   : 44852000 (beats 7%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

public class Codec {
    Map<String, String> map = new HashMap<>();
    String base = "http://tinyurl.com/";
    Random rand = new Random();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key;
        do {
            key = generateKey();
        } while (map.containsKey(key));
        map.put(key, longUrl);
        return base + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(base, "");
        return map.get(key);
    }

    private String generateKey() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
