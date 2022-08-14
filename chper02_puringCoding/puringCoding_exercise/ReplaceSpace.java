package chper02_puringCoding.puringCoding_exercise;

public class ReplaceSpace {
   public static void main(String[] args) {
       String a = "We are happy.";
      System.out.println(replaceSpace(a));
  }
  public static String replaceSpace(String a) {
      StringBuilder sBuilder = new StringBuilder();
      for(char s : a.toCharArray()) {
          String str = Character.toString(s);
          if (str.equals(" ")) {
            sBuilder.append("%20");
          } else {
              sBuilder.append(str);
          }
      }
      return sBuilder.toString();
  }  
}