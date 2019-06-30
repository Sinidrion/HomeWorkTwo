import java.util.Scanner;

public class Task4104 {

    public static void main(String[] args) {
        System.out.println("Введите порядковый номер дня недели");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n==1){
            System.out.println("Понедельник");
        }else if (n==2){
            System.out.println("Вторник");
        }else if (n==3){
            System.out.println("Среда");
        }else if (n==4){
            System.out.println("Четверг");
        }else if (n==5){
            System.out.println("Пятница");
        }else if (n==6){
            System.out.println("Суббота");
        }else if (n==7){
            System.out.println("Воскресенье");
        }else {
            System.out.println("Такого дня недели не сущевствует");
        }
    }
}
