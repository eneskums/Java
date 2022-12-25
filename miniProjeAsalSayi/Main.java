public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println(number + " sayısı asal sayı değildir.");
            return;
        }

        if (number < 1) {
            System.out.println(number + " sayısı geçersiz sayıdır.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " sayısı asal sayıdır.");
        } else {
            System.out.println(number + " sayısı asal sayı değildir.");
        }
    }
}
