import java.util.Scanner;

public class Task122 {

    public static void main(String[] args) {
        System.out.println("Введите значение x");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = (7 * (int)Math.pow(x,2)) - (3 * x) + 6;
        System.out.println("y=" + y);
        System.out.println("Введите значение a");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        int X = (12 * (int)Math.pow(a,2)) - (7 *a) + 6;
        System.out.println("x=" + X);
    }
}
