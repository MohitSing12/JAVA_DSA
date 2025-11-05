package OOPS_2;

public class Generics {
    public static void main(String[] args) {
        Integer[] arr={1,23,4,40,5};
        Display(arr);
        String[] arr1={"Mohit","Delhi","Rohan"};
        Display(arr1);
    }
    public static <T> void Display(T[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
