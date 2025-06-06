//public class Parenthesis_remove_1021 {
////    public static void main(String[] args) {
////        String s="(()())(())";
////        removeOuterParentheses(s);
////    }
//}
public static String removeOuterParentheses(String S) {
    StringBuilder s = new StringBuilder();

    int opened = 0;
    for (char c : S.toCharArray()) {
//        System.out.println(opened);
        if (c == '(' && opened++ > 0) s.append(c);
        if (c == ')' && opened-- > 1) s.append(c);
    }
    return s.toString();
}

public void main() {
    String s="(()())(())";
    System.out.println(removeOuterParentheses(s));
}