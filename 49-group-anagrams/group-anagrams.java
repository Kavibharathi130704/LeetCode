class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
         Map<String, List<String>> map = new HashMap<>();
         
         for(String word:str){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sortword=new String(chars);

            if(!map.containsKey(sortword)){
                map.put(sortword, new ArrayList<>());
            }
            map.get(sortword).add(word);
         }
        return  new ArrayList<>(map.values());
    }
}