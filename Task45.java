import java.util.Scanner;

public class Task45 {

    public static void main(String[] args) {
        System.out.println("Задайте значение x");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        if(x>=2)
            System.out.println("a)y=2");
        else
            System.out.println("a)y=" + x);
        if(x>=3)
            System.out.println("б)y=-3");
        else
            System.out.println("б)y=" + x);


    }
}
