class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        seen = {}
        for i, sstring in enumerate(strs):
            sorted_str = ''.join(sorted(sstring))
            if sorted_str in seen.keys():
                seen[sorted_str].append(sstring)
            else:
                seen[sorted_str] = [sstring]
        return list(seen.values())