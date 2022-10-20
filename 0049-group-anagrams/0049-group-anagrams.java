class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0){
            return new ArrayList();
        }
        
        HashMap<String, List<String>> out = new HashMap();
        for(String s : strs ){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newKey = String.valueOf(chars);
            
            if(!out.containsKey(newKey)){
               out.put(newKey, new ArrayList());
            } 
            out.get(newKey).add(s);
        }
        return new ArrayList(out.values());
    }
}