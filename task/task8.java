public class task8 {

    static int sum(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            total += n;
            System.out.println("Cumulative sum: " + total);
        }

        return total;
    }

    public static void main(String[] args) {
        int total = sum(4, 5, 10);

        System.out.println("Total sum: " + total);
    }
}