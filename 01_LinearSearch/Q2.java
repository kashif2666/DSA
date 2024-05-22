// search in a string

import java.util.Arrays;

public class Q2 {
  public static void main(String[] args) {
    String name = "Kashif";
    char target = 'a';
    System.out.println(search(name, target));
    System.out.println(Arrays.toString(name.toCharArray()));

  }

  // Method-1
  static boolean search(String str, char target) {
    if (str.length() == 0) {
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (target == str.charAt(i)) {
        return true;
      }
    }

    return false;
  }

  // Method-2
  static boolean search2(String str, char target) {
    if (str.length() == 0) {
      return false;
    }
    for (char ch : str.toCharArray()) {
      if (ch == target) {
        return true;
      }
    }

    return false;
  }

}
