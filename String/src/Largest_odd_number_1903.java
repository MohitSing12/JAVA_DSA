package String.src;

//"52"="5"
//"2602"=""
public class Largest_odd_number_1903 {
    public static void main(String[] args) {
        String s = "239537672423884969653287101";
        System.out.println(largestOddNumber(s));

    }

    public static String largestOddNumber(String s) {

        int n=s.length();
        int odd=-1;
        for(int i=n-1;i>=0;i--){
            int n1=s.charAt(i)-'0';
            if(n1%2!=0){
                odd=i;
                break;
            }
        }

        return s.substring(0,odd+1);
    }
}
