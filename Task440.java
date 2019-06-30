import java.util.Scanner;

public class Task440 {

    public static void main(String[] args) {
        System.out.println("Задайте число x в формате с плавающей точкой(один знак после запятой)");
        Scanner num = new Scanner(System.in);
        float x = num.nextFloat();
        if(-2.4<=x && x<=5.7)
                System.out.println(Math.pow(x,2));
            else
                System.out.println(4);

    }
}
