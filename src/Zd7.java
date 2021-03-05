import java.util.Scanner;

public class Zd7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a_paral_e;
        System.out.print("введите сторону a ");
        a_paral_e = in.nextDouble();
        double b_paral_f;
        System.out.print("введите сторону b ");
        b_paral_f = in.nextDouble();
        double c_paral_e;
        System.out.print("введите сторону c ");
        c_paral_e = in.nextDouble();
        double d_paral_f;
        System.out.print("введите сторону d ");
        d_paral_f = in.nextDouble();
        double e;
        System.out.print("введите сторону e ");
        e = in.nextDouble();
        double f;
        System.out.print("введите сторону f ");
        f = in.nextDouble();
        if (a_paral_e + c_paral_e <= e && b_paral_f <= f && d_paral_f <= f) {
            System.out.println("дома помещаются");
        } else {
            System.out.println("дома не помещаются");
        }

    }
}
