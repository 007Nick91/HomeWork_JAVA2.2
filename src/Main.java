public class Main {
    public static void main(String[] args) {
        int account = 1200;
        int payment = 1100;
        int bonusOne;
        if (payment > 1000) {
            bonusOne = 1;
        } else {
            bonusOne = 0;
        }
        int one = payment / 100;
        int two = bonusOne * one;
        int end = two + account;
        System.out.println("Итог:" + end);
    }
}