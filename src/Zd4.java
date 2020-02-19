import java.util.Scanner;

public class Zd4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        System.out.print("Введите значение стороны a ");
        a = in.nextDouble();
        double b;
        System.out.print("Введите значение стороны b ");
        b = in.nextDouble();
        double S1= a*b;
        System.out.println(S1);
        double r;
        System.out.print("Введите радиус круга ");
        r = in.nextDouble();
        final double Pi = 3.1415926536;
        double S2 = Pi * r * r;
        System.out.println(S2);
        if (S2 >= S1)
            System.out.println("Прямоугольное отверстие закрывается круглой картонкой");
        else
            System.out.println("Прямоугольное отверстие не закрывается круглой картонкой");

    }
}
