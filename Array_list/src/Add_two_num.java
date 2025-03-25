import java.util.ArrayList;

public class Add_two_num {
    public static void main(String[] args) {
//        int [] arr1=      {2,3,4,6};
//        int [] arr2={8,3,5,3,4,7,6};
        int[] arr1 = {1, 9};
        int[] arr2 = {7, 8};
        Addnumber(arr1, arr2);
    }

    public static void Addnumber(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        if (carry>0) {
            list.add(carry);
        }
        while (i >= 0) {
            int sum = arr1[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        for (int k = list.size() - 1; k >= 0; k--) {
            System.out.print(list.get(k) + " ");

        }
    }
}
