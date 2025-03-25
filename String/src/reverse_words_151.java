package String.src;

public class reverse_words_151 {
    public static void main(String[] args) {
        String s = "Hello  world to";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s1){
        String[] s=s1.split("\\s+");
       StringBuilder str=new StringBuilder();

       for(int i=s.length-1; i>=0;i--){
           str.append(s[i]);
           if(i!=0){
               str.append(" ");
           }
       }
       return str.toString().trim();

    }
}
