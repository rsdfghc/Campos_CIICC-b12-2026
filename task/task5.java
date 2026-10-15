public class task5 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        if (a == b && b == c)
            System.out.println("All numbers are equal");
        else
            System.out.println("Largest: " + Math.max(a, Math.max(b, c)));
    }
} 