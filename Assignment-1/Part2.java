import java.util.*;

public class Part2 {

   public static void main(String[] args) {
      System.out.println(isStringPermutation("asdf", "fsda"));
      System.out.println(isStringPermutation("asdf", "fsa"));
      System.out.println(isStringPermutation("asdf", "fsax"));
      System.out.println(isStringPermutation("asdf", ""));
      System.out.println(isStringPermutation("", ""));
      System.out.println(isStringPermutation("", "as"));

   }

   public static boolean isStringPermutation(String s1, String s2) {
      if (s1.length() != s2.length()) {
          return false;       
      }

      char s1Array[] = s1.toCharArray();
      Arrays.sort(s1Array);
      char s2Array[] = s2.toCharArray();
      Arrays.sort(s2Array);
      
      for (int i = 0; i < s1Array.length; i++) {
         if (s1Array[i] != s2Array[i]) {
            return false;
         }
      }
    
    
    
    
//       for (int i = 0; i < s1.length(); i++) {
//          char c = s1.charAt(i);
//          if (s2.indexOf('c') == -1) {
//             return false;
//          }
//       }
       return true;
   }
   
  }