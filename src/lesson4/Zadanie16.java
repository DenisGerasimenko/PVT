package lesson4;

public class Zadanie16 {
    public static void main(String[] args) {
        int mas[] = new int[9];
        int i;
        int k;
        for (i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (i = 0; i <= mas.length / 2; i++) {
            k = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - 1 - i] = k;
        }
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");

        }
    }
}
