import org.w3c.dom.ls.LSOutput;

public class Person {
    String name = "mohit";
    int age = 10;


//    public Person() { //Default constructor
//
//    }

    //Parametrized contructor;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void Intro() {
        System.out.println("My name is " + name + " and age is " + age);
    }

}
