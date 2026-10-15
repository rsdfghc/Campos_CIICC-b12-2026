package chapter1;
import java.util.*;

public class Flower {
    String name, color;

    public static void main(String[] args) {
        Flower f = new Flower();
        f.name = "Sunflower";
        f.color = "Yellow";

        System.out.println(f.name + "\n" + f.color);
        System.out.println(new Random().nextInt(100));
        
        ArrayList<String> al = new ArrayList<>();
        al.add("Daisy");
        System.out.println(al);
    }
}