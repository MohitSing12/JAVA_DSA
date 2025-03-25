public class Minimum_rotated_array {
    public static void main(String[] args) {
int []arr={21, 27, 30, 38 ,39 ,46 ,11, 12, 15 ,19 };
int a= findMin(arr);
        System.out.println(a);
    }
    public static int mini(int[] arr){
        int ans= Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        while(low<=high) {

            int mid = (low + high) / 2;
            if(arr[high]>arr[low]){
                ans=arr[low];
                break;
            }
            if (arr[mid] > arr[low]) {
                ans = Math.min(ans, arr[low]);
                low=mid+1;
            } else {

                if (arr[mid] < arr[high]) {
                    ans = Math.min(arr[mid], ans);
                    high=mid-1;
                }
            }
        }
        return ans;
    }
    public static int findMin(int []arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;

            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                ans = Math.min(ans, arr[low]);

                // Eliminate left half:
                low = mid + 1;

            } else { //if right part is sorted:

                // keep the minimum:
                ans = Math.min(ans, arr[mid]);

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return ans;
    }
}
