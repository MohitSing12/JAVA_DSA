public class Car {


    private String color;
    private int price;
    private int speed;

    public Car(String color, int price, int speed) {
        this.color = color;
        this.price = price;
        this.speed = speed;

    }




    //    //Encapsulation
//    //Setter
    public void Setcolor(String color) {
        this.color = color;
    }

//    public void Setprice(int price) throws Exception {
//        if(price<0){
//            throw new Exception("-ve value");
//        }
//        this.price = price;
//    }
    public void Setprice(int price) {
        try {
            if (price < 0) {
                throw new Exception("-ve value");
            }

            this.price = price;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("hi Hello Kaise ho!!  ");
        }
    }

    public void Setspeed(int speed) {
        if(speed<0){
            return;
        }
        this.speed = speed;
    }

//    //Getter
    public String Getcolor() {
        return this.color = color;
    }

    public int Getprice() {
        return this.price = price;
    }

    public int Getspeed() {
        return this.speed = speed;
    }
    public void display_car() {
        System.out.println("color=" + color + " price=" + price + " speed=" + speed);
    }
}