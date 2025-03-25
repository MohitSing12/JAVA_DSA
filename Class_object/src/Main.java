

public class Main {
    String name = "Mohit";//class ka data variable
    int age = 21;//class ka data variable

    public void Intro() {
        System.out.println("My name is " + name + " and age is " + age);
    }
    public void conflict(String name){
        System.out.println(name+" meets "+this.name);
        //Here this.name will refer to the name that is being declared in the reference_class.java
    }
}