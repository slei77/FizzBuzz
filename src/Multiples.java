public class Multiples {
    public static void main(String[] args) {

        int amount = 0;

        for (int i = 1; i < 1000; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                amount++;
            }
        }

        System.out.println(amount);
    }
}
