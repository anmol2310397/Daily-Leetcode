from collections import Counter
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        
        l=len(s1)
        di=Counter(s1)
        i=0
        d=Counter(s2[:l])
        if d==di:
                return True
        i,j=0,l
        while j<len(s2):
            print(d,di)
            if d==di:
                return True
            if s2[j] not in d:
                d[s2[j]]=1
            else:
                d[s2[j]]+=1
            d[s2[i]]-=1
            if d[s2[i]]==0:
                del d[s2[i]]
            j+=1
            i+=1
            if d==di:
                return True
        return False
                
            