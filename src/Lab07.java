import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
        mySet<String> set = new mySet<>();
        System.out.println("Before add");
        //Test isEmpty Method begin
        System.out.println("set isEmpty : " + set.isEmpty());

        //Test size Method begin
        System.out.println("size of set : " + set.size());

        System.out.println("After add");
        //Test add Method
        set.add("PremX");
        set.add("Mr.J");
        set.add("Oh JAVA");
        set.add("I love OOP");

        //set can't contain repeat object
        set.add("I love OOP");

        //Test isEmpty Method after add
        System.out.println("set isEmpty : " + set.isEmpty());

        //Test size Method after add
        System.out.println("size of set : " + set.size());

         //Test iterating through for loop
        System.out.print("set contains : ");
        for (String a:set){
            System.out.print("\""+a + "\" ");
        }
        System.out.println("");

        //Test contains Method
        System.out.println("---set contain 'I love OOP' : " + set.contains("I love OOP") +"---");

        //Test remove Method
        System.out.println("---remove \"Oh JAVA\"---");
        set.remove("Oh JAVA");
        System.out.print("set contains : ");
        for (String a:set){
            System.out.print("\""+a + "\" ");
        }
        System.out.println("");

        //Test addAll Method
        System.out.println("---addAll elements in set to set2---");
        mySet<String> set2 = new mySet<>();
        set2.addAll(Arrays.asList("Mr.J","PremX","I love OOP"));
        System.out.print("set2 contains : ");
        for (String a:set2){
            System.out.print("\""+a + "\" ");
        }
        System.out.println("");

        //Test containsAll Method

        System.out.println("---set2 containAll set ? : " + set2.containsAll(set) + "---");

        //Test retainAll Method
        System.out.println("---set2 retains \"Mr.J\" , \"PremX\"---");
        set2.retainAll(Arrays.asList("Mr.J","PremX"));

        //Test removeAll
        System.out.println("---remove \"I love OOP\" ,\"PremX\" on set---");
        set.removeAll(Arrays.asList("I love OOP","PremX"));
        System.out.print("set contains : ");
        for (String a:set){
            System.out.print("\""+a + "\" ");
        }
        System.out.println("");


        //Test clear Method
        System.out.println("--- clear elements in set2---");
        set2.clear();
        System.out.print("set2 contains : ");
        for (String a:set2){
            System.out.print("\""+a + "\" ");
        }
        System.out.println("");







    }
}
