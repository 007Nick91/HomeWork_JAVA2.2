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
        int bonusTwo = 0;
        if (payment < 1100) ;
        int one = payment / 100;
        int two = bonusOne * one + bonusTwo;
        int end = two + account;
        System.out.println("Итог:" + end);
    }
}