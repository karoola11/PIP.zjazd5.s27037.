import java.util.Scanner;
public class Zadnie3 {
    public static void main(String[] args) {
    int n = zeskanujLiczbe();
        if (n % 2 == 0) {
            n--;
        }
        int k = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }

            for (int j = n - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
            k++;
        }
    }

    public static int zeskanujLiczbe() {
        return new Scanner(System.in).nextInt();

    }
}