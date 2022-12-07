import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        int x = zeskanujLiczbe();
        int y = zeskanujLiczbe();
        int z = zeskanujLiczbe();

        int wartosc1 = Math.max(x,y);
        int maxValue = Math.max(wartosc1,z);

                for (int i = 0; i<=maxValue;i++) {
                    if (i <= maxValue - x) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");
                    }
                    if (i <= maxValue - y) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");
                    }
                    if (i <= maxValue - z) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");
                    }
                    System.out.println();

                }


    }


    public static int zeskanujLiczbe() {
        return new Scanner(System.in).nextInt();

    }
}