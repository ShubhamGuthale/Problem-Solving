public class RevString 
{
        public static void main(String[] args) {
          String originalStr = "Hello";
          String revStr = "";
          System.out.println("Original string: " + originalStr);
              
          for (int i = 0; i < originalStr.length(); i++) 
          {
            revStr = originalStr.charAt(i) + revStr;
          }
          
          System.out.println("Reversed string: "+ revStr);
        }
}
