class ques_9 {
    public static void main(String[] args) {
        int x=121;
        isPalindrome(x);
    }
    public static boolean isPalindrome(int x) {
        int[] arr=new int[x];
        for(int i=0; i<4; i++) {
//            arr[i] = Integer.parseInt(x);
        }
        int i=arr[0];
        int j=arr.length-1;
        while(i<j){
            if(i!=j){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
