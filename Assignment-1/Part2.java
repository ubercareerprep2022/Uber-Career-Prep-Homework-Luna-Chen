import java.util.*;

public class Part2 {

   public static void main(String[] args) {
      System.out.println(isStringPermutation("asdf", "fsda"));
      System.out.println(isStringPermutation("asdf", "fsa"));
      System.out.println(isStringPermutation("asdf", "fsax"));
      System.out.println(isStringPermutation("asdf", ""));
      System.out.println(isStringPermutation("", ""));
      System.out.println(isStringPermutation("", "as"));
      
      List<Integer> test = new ArrayList<>();
      test.add(1);
      test.add(2);
      test.add(3);
      test.add(4);
      test.add(5);
      
      System.out.println(pairsThatEqualSum(test, 5));
      System.out.println(pairsThatEqualSum(test, 1));
      System.out.println(pairsThatEqualSum(test, 7));

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
       return true;
   }
   
   public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
      List<List<Integer>> result = new ArrayList<>();
      Map<Integer, Integer> map = new HashMap<>();
      
      for(int i = 0; i < inputArray.size(); i++) {
          map.put(inputArray.get(i), 0);
      }
       
      for(int i = 1; i < targetSum / 2 + 1; i++) {
          if(map.containsKey(targetSum - i)) {
             List<Integer> pairs = new ArrayList<>();
             pairs.add(i);
             pairs.add(targetSum - i);
             result.add(pairs);
          }   
      }
      return result;
   }
}