public class Maze_path {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        System.out.println("\n"+PrintPath(0, 0, n - 1, m - 1, ""));
    }

    //cr-->current row,cc-->current column,er-->end row,ec-->end column
    public static int PrintPath(int cr, int cc, int er, int ec, String ans) {
        if (cr == er && cc == ec) {
              System.out.print(ans + " ");
            return 1;
        }
        if (cr > er || cc > ec) {
            return 0;
        }

        int s1 = PrintPath(cr, cc + 1, er, ec, ans + "H");
        int s2 = PrintPath(cr + 1, cc, er, ec, ans + "V");

        return s1 + s2;
    }
}

