import java.util.Scanner;

public class Task41 {

    public static void main(String[] args) {
        System.out.println("Введите значение x");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        if (x > 0)
            System.out.println(Math.pow(Math.sin(x),2));
        else
            System.out.println(1-(2*Math.sin(Math.pow(x,2))));
    }
}
