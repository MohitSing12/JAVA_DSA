package Lecture_59;



public class Hashmap_client {
    public static void main(String[] args) {
        Hashmap_implementation map=new Hashmap_implementation();
        map.put("Mohit",100);
        map.put("Rohit",59);
        map.put("Aman",35);
        map.put("Varun",85);
        map.put("Shobhit",84);
        System.out.println(map);
        System.out.println(map.get("Mohit"));
        System.out.println(map.containsKey("Rohit"));
        map.remove("Shobhit");
        System.out.println(map);
    }
}
