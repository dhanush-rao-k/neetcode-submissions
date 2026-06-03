class Solution:
        def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
                map={}
                for i in strs:
                    srt="".join(sorted(i))
                    if(srt in map):
                        map[srt].append(i)
                    else:
                        map[srt]=[i]
                return list(map.values())