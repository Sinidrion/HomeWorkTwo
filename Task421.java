import java.util.Scanner;

public class Task421 {

    public static void main(String[] args) {
        System.out.println("Задайте число а");
        Scanner num = new Scanner(System.in);
        int a =num.nextInt();
        System.out.println("Задайте число b");
        Scanner num1 = new Scanner(System.in);
        int b =num1.nextInt();
        if(b%a==0)
            System.out.println("Число а является делитетелем числа b");
        else
            System.out.println("Число а не является делитетелем числа b");

    }
}
