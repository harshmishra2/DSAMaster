class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for(String word : strs){

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord, new ArrayList<>());
            }

            mp.get(sortedWord).add(word);
        }

        return new ArrayList<>(mp.values());
        
    }
}


//https://leetcode.com/problems/group-anagrams/?envType=study-plan-v2&envId=top-interview-150






// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         // String[] arr = new String[strs.lenght()];
//         List<String> list = new ArrayList<>();

//         for(int i= 0; i<strs.length; i++){
//             char[] curArr = strs[i].toCharArray();
//             Arrays.sort(curArr);
//             String curStr = new String(curArr);
//             list.add(curStr);
//         }

//         HashMap<String, List<String>> hm = new HashMap<>();

//         for(int i=0; i<strs.length; i++){
//             if(hm.containsKey(list.get(i))){
//                 List<String> indexes = hm.get(strs[i]);
//                 indexes.add(strs[i]);
//                 hm.put(strs[i], indexes);
//             }else{
//                 hm.put(list.get(i), Arrays.asList(strs[i]));
//             }
//         }
        
//         List<List<String>> result = new ArrayList<>();

//         for(HashMap.Entry< String, List<String>> entry : hm.entrySet()){
//             result.add(entry.getValue());
//         }
//         return result;
//     }
// }
