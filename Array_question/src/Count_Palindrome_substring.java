package Array_question.src;

public class Count_Palindrome_substring {
    public static void main(String[] args) {
        String s = "ABBA";
        int palindrome_count = palindrome(s);
        System.out.println(palindrome_count);
    }

    public static int palindrome(String s) {
        int count = 0;
        //odd
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
                    break;
                }
                count++;
            }
        }


        //even
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}

