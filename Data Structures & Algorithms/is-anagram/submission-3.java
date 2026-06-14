class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> isAnagram = new HashMap <Character,Integer>();
      char[] s_new = s.toCharArray();
      for (char i :s_new){
        isAnagram.put(i,isAnagram.getOrDefault(i,0)+1);
      }

char[] t_new = t.toCharArray();
      for (char j:t_new){
        isAnagram.put(j,isAnagram.getOrDefault(j,0)-1);
      }
      for(int count : isAnagram.values()){
        if (count!=0)return false;
      }
      
    
  return true;  }}
       