import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        int n = zeskanujLiczbe();
        int drugiwyraz = 1;
        int pierwszywyraz = 0;


        int i = 1;
        while (i <= n){
            i++;
            System.out.println(pierwszywyraz);

            int kolejnywyraz = pierwszywyraz + drugiwyraz;
            pierwszywyraz = drugiwyraz;
            drugiwyraz = kolejnywyraz;


        }

    }

    public static int zeskanujLiczbe() {
        return new Scanner(System.in).nextInt();
    }
}
