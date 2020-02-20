import java.util.Scanner;

public class Zd10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите число");
        n = in.nextInt();
        int sum=0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum);
    }
}
