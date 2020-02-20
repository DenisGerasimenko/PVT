/*
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Zd6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d;
        System.out.println("Введите день ");
        d = in.nextInt();
        int m;
        System.out.println("Введите месяц");
        m = in.nextInt();
        int y;
        System.out.println("Введите год");
        y = in.nextInt();
        if (m == 1 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "января" + y + "года");
        } else if (m == 2 && d > 0 && d < 30 && y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
            System.out.println(d + "февраля" + y + "года");
        } else if (m == 2 && d > 0 && d < 29 && y % 4 != 0) {
            System.out.println(d + "февраля" + y + "года");
        } else if (m == 3 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "марта" + y + "года");

        } else if (m == 4 && d > 0 && d < 31 && y > 0) {
            System.out.println(d + "апреля" + y + "года");
        } else if (m == 5 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "мая" + y + "года");
        } else if (m == 6 && d > 0 && d < 31 && y > 0) {
            System.out.println(d + "июня" + y + "года");
        } else if (m == 7 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "июля" + y + "года");
        } else if (m == 8 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "августа" + y + "года");
        } else if (m == 9 && d > 0 && d < 31 && y > 0) {
            System.out.println(d + "сентября" + y + "года");
        } else if (m == 10 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "октября" + y + "года");
        } else if (m == 11 && d > 0 && d < 31 && y > 0) {
            System.out.println(d + "ноября" + y + "года");
        } else if (m == 12 && d > 0 && d < 32 && y > 0) {
            System.out.println(d + "декабря" + y + "года");
        } else {
            System.out.println("такой даты не существует");
            in.close();
        }
    }

}
*/
