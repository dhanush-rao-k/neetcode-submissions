class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map={}
        op=[]
        for i in nums:
            if(i in map):
                map[i]+=1
            else:
                map[i]=1
        valsort=sorted(map.items(), key=lambda item : item[1], reverse=True)
        for i in range(k):
            op.append(valsort[i][0])
        return op
            






        