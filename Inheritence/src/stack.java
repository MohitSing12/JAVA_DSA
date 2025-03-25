public class stack {
 protected int[]arr;
    public stack(){
        arr=new int[5];
    }
    public stack(int n){
        arr=new int[n];
    }
    int top=-1;
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==arr.length-1;
    }
    public void push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Bhai stack full hai!");
        }
        top++;
        arr[top]=item;
    }
    public int pop() throws Exception{
       if( isEmpty()){
            throw new Exception("Bhai stack khali pada hai!");
        }
        int rv=arr[top];
        top--;
        return rv;
    }
    public int peek()throws Exception{
        if( isEmpty()){
            throw new Exception("Bhai stack khali pada hai!");
        }
        int rv=arr[top];
        return rv;
    }
    public int size(){
        return top+1;
    }
    public void display(){
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }


}
