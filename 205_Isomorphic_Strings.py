# First solution
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_chars_seen = {}
        s_index = 0
        s_new_str = ""
        for ch in s:
            if ch not in s_chars_seen:
                s_chars_seen[ch] = str(s_index) + " "
                s_new_str += s_chars_seen[ch]
                s_index += 1
            else:
                s_new_str += s_chars_seen[ch]
        t_index = 0
        t_chars_seen = {}
        t_new_str = ""
        for ch in t:
            if ch not in t_chars_seen:
                t_chars_seen[ch] = str(t_index) + " "
                t_new_str += t_chars_seen[ch]
                t_index += 1
            else:
                t_new_str += t_chars_seen[ch]
        return s_new_str == t_new_str

# Optimized solution
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        s_chars_seen = {}
        t_chars_seen = {}
        for i in range(len(s)):
            if s[i] not in s_chars_seen:
                s_chars_seen[s[i]] = i
            if t[i] not in t_chars_seen:
                t_chars_seen[t[i]] = i
            if s_chars_seen[s[i]] != t_chars_seen[t[i]]:
                return False
        return True