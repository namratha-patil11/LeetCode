class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        
        curLen = 0
        maxLen = 0
        setOfChars = set()
        
        if len(s) == 1:
            return 1
        
        for i in range(len(s)):
            setOfChars = set()
            setOfChars.add(s[i]) 
            curLen = 1
            for j in range(i+1,len(s)):
                if s[j] in setOfChars:
                    maxLen = max(curLen,maxLen)
                    break
                else:
                    setOfChars.add(s[j])
                    curLen += 1
                    print(curLen)
            maxLen = max(curLen,maxLen)

        
        return maxLen