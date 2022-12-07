import java.util.Scanner;
public class Zadnie3_1 {
    public static void main(String[] args) {
        int n = zeskanujLiczbe();
        if (n % 2 == 0) {
            n--;
        }
        int srodek = (n / 2) + 1;

        for (int i = 1; i <= srodek; i++) {

            for (int j = 0; j < srodek - i; j++) System.out.print(" ");

            for (int j = 0; j < (i * 2) - 1; j++) System.out.print("*");

            System.out.println();
        }

        }

        public static int zeskanujLiczbe () {
            return new Scanner(System.in).nextInt();
        }
    }
