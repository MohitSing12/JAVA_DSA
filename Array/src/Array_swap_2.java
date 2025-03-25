public class Array_swap_2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int[] other={5,15,25,35,45};
        System.out.println(arr[0]+" "+other[0]);
        swap(arr,other);
        System.out.println(arr[0]+" "+other[0]);
    }
    public static void swap(int[] arr,int[] other){
        int[] temp=arr;
        arr=other;
        other=temp;
        System.out.println(arr[0]+" "+other[0]);//This swap is not reflected in the main class.

    }
}
