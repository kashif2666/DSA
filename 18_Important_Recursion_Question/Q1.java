// GOOGLE QUESTION
import java.util.ArrayList;

//1- Phonepad key combination
//2- Phonepad key combination with ArrayString
//3- Count the no. of combinatiom

public class Q1 {
  public static void main(String[] args) {
    // phonePad("", "12");
    System.out.println(phonePadRet("", "123"));
    System.out.println(phonePadCount("", "123"));
  }
  static void phonePad(String p, String up){
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }

    int digit=up.charAt(0)-'0'; // it will convert '2' into 2
    for(int i=(digit-1)*3;i<(digit*3);i++){
      char ch=(char)('a'+i);
      phonePad(p+ch, up.substring(1));
    }
  }

  static ArrayList<String> phonePadRet(String p, String up){
    if (up.isEmpty()) {
      ArrayList<String> list=new ArrayList<>();
      list.add(p);
      return list;
    }

    int digit=up.charAt(0)-'0'; // it will convert '2' into 2
    ArrayList<String> list=new ArrayList<>();
    for(int i=(digit-1)*3;i<(digit*3);i++){
      char ch=(char)('a'+i);
      list.addAll(phonePadRet(p+ch, up.substring(1)));
    }
    return list;
  }

  static int  phonePadCount(String p, String up){
    if (up.isEmpty()) {
      return 1;
    }
int count=0;
    int digit=up.charAt(0)-'0'; // it will convert '2' into 2
    for(int i=(digit-1)*3;i<(digit*3);i++){
      char ch=(char)('a'+i);
      count=count+phonePadCount(p+ch, up.substring(1));
    }
    return count;
  }
}
