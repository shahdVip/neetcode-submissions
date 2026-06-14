class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> isAnagram = new HashMap <Character,Integer>();
      char[] s_new = s.toCharArray();
      for (int i = 0 ; i<s_new.length;i++){
        isAnagram.put(s_new[i],isAnagram.getOrDefault(s_new[i],0)+1);
      }

char[] t_new = t.toCharArray();
      for (int i = 0 ; i<t_new.length;i++){
        isAnagram.put(t_new[i],isAnagram.getOrDefault(t_new[i],0)-1);
      }
      for(int count : isAnagram.values()){
        if (count!=0)return false;
      }
      
    
  return true;  }}
       