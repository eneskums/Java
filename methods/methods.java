public class methods {
    public static void main(String[] args) {
        arkadasSayi();
    }
    public static void arkadasSayi() {
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for (int j = 1; j < sayi2; j++) {
            if (sayi2 % j == 0) {
                toplam2 = toplam2 + j;
            }
        }

        if (toplam1 == sayi2 && toplam2 == sayi1) {
            mesajVer(sayi1 + " ve " + sayi2 + " arkadaş sayılardır.");
        } else {
            mesajVer(sayi1 + " ve " + sayi2 + " arkadaş sayı değillerdir.");
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
