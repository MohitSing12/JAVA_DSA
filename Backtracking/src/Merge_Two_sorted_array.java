public class Merge_Two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 7, 11};
        int[] arr2 = {1, 2, 3, 7, 12, 13, 14, 15};
        int []ans=merge_array(arr1,arr2);
       for (int i=0;i<ans.length;i++){
           System.out.print(ans[i]+" ");
       }
    }

    public static int[] merge_array(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
           ans[k]=arr2[j];
           j++;
           k++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }


}

