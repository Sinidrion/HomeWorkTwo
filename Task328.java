public class Task328 {

    public static void main(String[] args) {
        int A = 132;
        int B = 111;
        int C =(-33);
        boolean a = (A > 100 && B > 100)? true : false;
        boolean b = ((A%=2)==0 || (B%=2)==0)? true : false;
        boolean c = (A > 0 || B > 0)? true : false;
        boolean d = ((A%=3)==0 && (B%=3)==0 && (C%=3)==0)? true : false;
        boolean e = (A < 50 || B < 50 || C < 50)? true : false;
        boolean f = (A < 0 || B < 0 || C < 0)? true : false;
        System.out.println("a)" + a);
        System.out.println("б)" + b);
        System.out.println("в)" + c);
        System.out.println("г)" + d);
        System.out.println("д)" + e);
        System.out.println("е)" + f);
    }
}
