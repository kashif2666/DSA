// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Q10_Panagram {
  public boolean checkIfPangram(String sentence) {
   int length=sentence.length();

  if (length<26) {
    return false;
  }

  for (char c = 'a'; c <='z'; c++) {
    if (!sentence.contains(String.valueOf(c))) {
      return false;
    }
  }

  return true;
  }
}
