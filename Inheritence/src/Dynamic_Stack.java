public class Dynamic_Stack extends stack {
    @Override
    public void push(int item) throws Exception {
        if (isFull()) {
            int[] newarr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
//        top++;
//        arr[top] = item;
        super.push(item);
    }
}
