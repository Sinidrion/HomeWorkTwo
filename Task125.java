import java.util.Scanner;

public class Task125 {

    public static void main(String[] args) {
    System.out.println("Введите длину стороны квадрата в сантиметрах");
    Scanner num = new Scanner(System.in);
    float side = num.nextFloat();
    float perimeter = side * 4;
    System.out.println("Периметр квадрата со стороной " + side + "см равен " + perimeter + "см");

    }
}
