class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h1 =  new HashMap<>();
        for(String s :strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(h1.containsKey(key)){
                h1.get(key).add(s);
            }else{
                ArrayList<String> l1= new ArrayList();
                l1.add(s);
                h1.put(key,l1);
            }
        }
        return new ArrayList(h1.values());
    }
}