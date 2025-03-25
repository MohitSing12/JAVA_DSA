public class reference_class {
    public static void main(String[] args) {

//        System.out.println("hello");
        Main m = new Main();
        m.name="Rohit";
        m.age=20;
        m.Intro();
//
        Main m1 = new Main();
        m1.name="Mohit";
        m1.age=21;
        m1.Intro();
        m.conflict("raja");
        m1.conflict("raja");

//        Person p=new Person(19,"sam");
//        p.Intro();

    }
}
