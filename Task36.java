public class Task36 {

    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean z = true;
        boolean a = x || y && ! z;
        boolean b = !x && !y;
        boolean c = !(x && y) || z;
        boolean d = x && !y || z;
        boolean e = x && (!y || z);
        boolean f = x || (!(y || z));
        System.out.println("a)" + a);
        System.out.println("б)" + b);
        System.out.println("в)" + c);
        System.out.println("г)" + d);
        System.out.println("д)" + e);
        System.out.println("е)" + f);

    }
}
