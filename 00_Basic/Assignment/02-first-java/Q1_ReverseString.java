public class Q1_ReverseString{
  public static void main(String[] args) {
    String str="Kashif Anwar", newStr = "";

    for (int i = str.length()-1; i >=0; i--) {
      char ch=str.charAt(i);
      newStr+=ch;
    }

    System.out.println(newStr);

  }
}