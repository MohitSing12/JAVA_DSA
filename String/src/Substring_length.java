package String.src;

public class Substring_length {
    public static void main(String[] args) {
        String s="83415";
        for(int len=1;len<=s.length();len++){
            for (int j=len;j<=s.length();j++){
                int i=j-len;
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
