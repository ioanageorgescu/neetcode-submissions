class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sorted_s = sorted(s)
        sorted_t = sorted(t)

        new_sorted_s = ''.join(sorted_s)
        new_sorted_t = ''.join(sorted_t)

        return sorted_s == sorted_t