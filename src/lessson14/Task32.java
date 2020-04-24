package lessson14;


import java.io.*;

public class Task32 {
    public static void main(String[] args) {
        try (DataOutputStream os = new DataOutputStream(new FileOutputStream("D:\\file.txt"))) {
            for (int i = 0; i < 20; i++) {
                os.writeInt((int) (Math.random() * 20));
            }
            System.out.println("Файл записан");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        double res = 0;
        try (DataInputStream is = new DataInputStream(new FileInputStream("D:\\file.txt"))) {
            for (int i = 0; i < 20; i++) {
                int x;
                x = is.readInt();
                res += x;
                System.out.print(x + " ");

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(" ");
        res /= 20;
        System.out.println("среднее арифметическое равняется: " + res);

    }
}





