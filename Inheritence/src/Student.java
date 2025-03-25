public class Student {
    String name="Mohit";
    int age=21;

    @Override
    public String toString(){
        return this.name+" "+this.age;
        //Here we have override the toString method that is being initialised when we
        //write new keyword.And we print the value of object it will print the address.
        //So to override the object we can use the above function and print the required statement
    }
}
