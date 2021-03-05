import java.util.Scanner;

public class Zd11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите число ");
        n = in.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Число составное! ");
                return;
            }
        }
        System.out.println("Число простое!");

    }
}



