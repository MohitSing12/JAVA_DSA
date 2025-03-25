public class Client {
    public static void main(String[] args) {
        //case:1
//        P obj=new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        //Case:2
//        P obj = new C();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(((C) (obj)).d2);//If we write C.obj then it will throw compile time error so we need to typecast object
//        obj.fun();
//        obj.fun1();
//        ((C) (obj)).fun();

        //Case:3
//        C obj=new P();  Not Allowed

        //Case:4
        C obj=new C();
        System.out.println(obj.d);
        System.out.println(((P)(obj)).d);
        System.out.println(obj.d1);
        System.out.println(obj.d2  );

    }

}
