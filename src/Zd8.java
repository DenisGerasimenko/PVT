import java.util.Scanner;

public class Zd8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите число");
        n=in.nextInt();
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.println("Факториал числа =" +result);

    }

}
