public class Car_client {
    public static void main(String[] args) /*throws Exception*/
    {
        Car c=new Car("red",123334,95);
        c.display_car();
        System.out.println(c.Getcolor());;
        //access setter
        c.Setcolor("black");
        c.Setprice(-9231);
        c.Setspeed(12);
        //access getter

        c.display_car();
        System.out.println(c.Getcolor());
//        c.price=5734523;
//        c.display_car();
    }
}
