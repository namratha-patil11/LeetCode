class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        out_array = []
        word_dict = {}
        
        if len(strs) == 1:
            out_array.append(strs)
            return out_array
        else:
            for i in range(len(strs)):
                temp_chars = tuple(sorted(strs[i]))
                if word_dict.get(temp_chars) == None:
                    word_dict[temp_chars] = []
                    
                word_dict[temp_chars].append(strs[i])
                #print(word_dict)
                
            return word_dict.values()
        
        