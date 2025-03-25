public class ques_169 {
    public static void main(String[] args) {
        int []arr={3,2,3,3};

        Majority(arr);
    }
    public static void Majority(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int num=arr[i];
            for (int j=0;j<n;j++){
                int count=1;
                if(arr[j]==num){
                    count++;
                }
                arr[j]=count;
            }

        }
         for (int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
