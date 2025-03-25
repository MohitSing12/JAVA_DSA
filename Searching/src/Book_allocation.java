import java.util.Arrays;
import java.util.Scanner;

public class Book_allocation {
    public static void main(String[] args) {
        int nos = 2;




        int[] page= {10,20,30,40};

//        Arrays.sort(page);


        System.out.println(Min_page(page,nos));
    }
    public static int Min_page(int[] page,int nos){
        int low=0;
        int high=0;
        for (int i=0;i<page.length;i++){
            high=high+page[i];
        }
        int ans=0;
        while(low<=high) {
            int mid=(low+high)/2;
            if (is_it_possible(page, nos, mid)==true) {
                ans = mid;
                high=mid-1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    public static boolean is_it_possible(int[] page,int nos,int mid){
        int student=1;
        int read_page=0;
        for (int i=0;i<page.length;i++){
            if(read_page+page[i]<=mid){

                read_page+=page[i];
            }
            else{
                student++;
                read_page=page[i];
            }

        }
        if(student>nos){
            return false;
        }
        return true;
    }
}
