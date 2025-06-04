package Array_question.src;

public class Unique_elements_26 {
    public static void main(String[] args) {
        int []nums={1,1,2,2,3,3,4,5};
//        System.out.println(unique_elements(arr));
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count=1;
        int []arr1=new int[nums.length];
        arr1[0]=nums[0];
        int j=1;
        for(int i=1;i<nums.length;i++){


            if(nums[i]!=nums[i-1]){
                count++;
                nums[j]=nums[i];
                j++;


            }

        }
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
        return count;
    }

}
