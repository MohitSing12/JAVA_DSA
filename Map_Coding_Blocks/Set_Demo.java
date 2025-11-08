package Map_Coding_Blocks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(20);
        set.add(44);
        set.add(-12);
        set.add(36);
        System.out.println(set);
//        System.out.println(set.contains(-12));
//        set.remove(-12);
//        System.out.println(set);

        //To iterate over set we can use for-each loop
        for(int v:set){
            System.out.print(v+" ");
        }
        System.out.println();

        Set<Integer> set1=new TreeSet<>();
        set1.add(12);
        set1.add(20);
        set1.add(44);
        set1.add(-12);
        set1.add(36);
        System.out.println(set1);

        Set<Integer> set2=new LinkedHashSet<>();
        set2.add(12);
        set2.add(20);
        set2.add(44);
        set2.add(-12);
        set2.add(36);
        System.out.println(set2);
    }
}
