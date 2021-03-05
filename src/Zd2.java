import java.util.Scanner;
public class Zd2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sec, min,hrs,days,weeks;
        System.out.println("Введите количество секунд");
        sec=in.nextInt();
        min=sec/60;
        sec%=60;
        hrs=min/60;
        min%=60;
        days=hrs/24;
        hrs%=24;
        weeks=days/7;
        days%=7;
        System.out.println(weeks+"недель"+days+"дней"+hrs+"часов"+min+"минут"+sec+"секунд");
       in.close();

    }
}
