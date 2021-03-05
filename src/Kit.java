import java.util.Scanner;

public class Kit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Введите число");
        x = in.nextInt();
        if (x % 10 == 7)
            System.out.println("Число закакнчивается на 7");
        else
            System.out.println("Число не заканчивается на 7");
    }
}

