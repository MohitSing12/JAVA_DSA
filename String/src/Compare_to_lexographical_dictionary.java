package String.src;

//Lexographical dictionary question.
public class Compare_to_lexographical_dictionary {
    public static void main(String[] args) {
        String s1 = "komal";
        String s2 = "kamal";
        // System.out.println(s1.compareTo(s2));
        System.out.println(CompareTo(s1, s2));
        if(CompareTo(s1,s2)==0){
            System.out.println("s1 and s2 are equal length");
            return;
        }
        if(CompareTo(s1,s2)>0){
            System.out.println("s1 is greater than s2");
        }
        else{
            System.out.println("s2 is greater that s1");
        }
    }

    public static int CompareTo(String s1, String s2) {
        if (s1.equals(s2)) {
            return 0;
        }
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {

                return s1.charAt(i) - s2.charAt(i);//Ans +ve matlab s1 ki badi value matlab String s1 bada hai lexically
                //Ans -ve matlab s2 ki badi value matlab String s2 bada hai lexically

            }

        }
        return s1.length() - s2.length();
    }

}
