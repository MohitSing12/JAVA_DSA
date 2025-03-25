public class Rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {46, 46, 47, 47, 6, 8, 11, 15, 17, 17, 29, 33, 34, 38};
        int key = 33;
        System.out.println(rotated(arr, key));
    }

    public static boolean rotated(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                high--;
                low++;
                continue;

            }
            if (arr[low] <= arr[mid]) {
                if (key >= arr[low] && key <= arr[mid]) {
                    high = mid - 1;
                }
                else
                    low = mid + 1;

            } else {

                if (key <= arr[high] && key >= arr[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return false;

    }

}
