import java.util.Scanner;

public class Task485 {

    public static void main(String[] args) {
        System.out.println("Задайте значение x");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        if(x<-1){
            System.out.println("y=-1");
        } else if(x>-1){
            System.out.println("y=" + x);
        } else if(x==-1){
            System.out.println("y=1");
        }
    }
}
