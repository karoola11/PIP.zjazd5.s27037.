import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        int n = zeskanujLiczbe();
        for (int i = 0; i <= n; i++){
            System.out.println(i);


        }
        if (n < 0){
            for (int j = 0; j >= n; j-- ){
                System.out.println(j);

            }
        }
    }

    public static int zeskanujLiczbe() {
        return new Scanner(System.in).nextInt();
    }
}