// Q. 1&2- Remove a character from a string 
// Q. 3- Remove a Substring from a string 
// Q. 4- Remove a Substring from a string only if particular substring does not exist



public class Q1 {
  public static void main(String[] args) {
    // skipCharacter("", "baccdach");
    System.out.println(skipCharacter2( "baccdach"));
    System.out.println(skipString( "bcdappleccdach"));
    System.out.println(skipString2( "bcdapplccdach"));

    

  }

  static void skipCharacter(String p, String up){
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char ch=up.charAt(0);
    if (ch=='c') {
      skipCharacter(p, up.substring(1));
    } else {
      skipCharacter(p+ch, up.substring(1));
    }

  }

  
  static String skipCharacter2( String up){
    if (up.isEmpty()) {
      return "";
    }
    char ch=up.charAt(0);
    if (ch=='c') {
     return  skipCharacter2( up.substring(1));
    } else {
      return ch+skipCharacter2( up.substring(1));
    }

  }

  static String skipString( String up){
    if (up.isEmpty()) {
      return "";
    }
    
    if (up.startsWith("apple")) {
     return  skipString( up.substring(5));
    } else {
      return up.charAt(0)+skipString( up.substring(1));
    }

  }

  static String skipString2( String up){
    if (up.isEmpty()) {
      return "";
    }
    
    if (up.startsWith("app") && !up.startsWith("apple") ) {
     return  skipString2( up.substring(5));
    } else {
      return up.charAt(0)+skipString2( up.substring(1));
    }

  }
  
}
