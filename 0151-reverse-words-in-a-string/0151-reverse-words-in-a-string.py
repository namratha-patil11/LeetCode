class Solution:
    def reverseWords(self, s: str) -> str:
        
        listWords = []
        word = ''
        for i in range(0,len(s)):
            
            if s[i] == ' ':
                if len(word) > 0:
                    listWords.append(word)
                    print(listWords)
                    word = ''
            else:
                word += s[i]
                print(word)
        
        if len(word) > 0:
            listWords.append(word)
        output = '' 
        for i in range(len(listWords)-1,-1,-1):
            output = output + listWords[i]
            if i != 0:
                output = output + ' '
            
            
        print(listWords)
        print(output)
        return str(output)
        