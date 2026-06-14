class Solution {
    public boolean isAnagram(String s, String t) {
       char[]s_new= (s.toLowerCase()).toCharArray();
        
      char[] t_new=(t.toLowerCase()).toCharArray();
    
      Arrays.sort(s_new);
      Arrays.sort(t_new);
      if(Arrays.equals(s_new,t_new))
      return true ;
      else return false;
    }
}
