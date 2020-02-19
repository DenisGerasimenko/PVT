import java.util.Scanner;

public class Zd5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите n ");
        n = in.nextInt();

        if (n % 10 == 0) {
            System.out.println(n + "рублей");
        } else if (n == 1) {
            System.out.println(n + "рубль");
        } else if (n > 20 && n % 10 == 1) {
            System.out.println(n + "рубль");
        } else if (n > 1 && n <= 5) {
            System.out.println(n + "рубля");
        } else if (n % 10 >= 5) {
            System.out.println(n + "рублей");
        } else if (n % 100 >= 11 && n % 100 <= 15) {
            System.out.println(n + "рублей");
        }
    }
}
