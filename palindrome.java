public class palindrome {
    public static void main(String[] args) {
        if(args[0].length() == 0) {
            System.out.println("No word");
            return;
        }
        String a = args[0];
      if(a.equals(reverse(a))){
        System.out.println("Word is palindrome!");
      }else{
        System.out.println("Not palindrome");
      }
    }

    public static String reverse(String str) {
        String returnV = "";
        for(int i =str.length()-1; i>=0; i--){
            returnV += str.charAt(i);
        }
        return returnV;
    }
}