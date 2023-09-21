package Lection.Lection01;

public class program {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        float e = 2.7f; // для float всегда необходимо в конце числа ставить 'f'
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);
        char ch = '{';
        System.out.println(ch);
        boolean f = true ^ true;
        System.out.println(f);
        String msg = "Hello Nikolay";
        System.out.println(msg);
        var i = 123; // Integer
        var c = 123.456; // Double
        System.out.println(i);
        System.out.println(getType(i));
        System.out.println(getType(c));
        int j = 123;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int s = 1200;
        s = s-- - --s;
        System.out.println(s);
        s = --s - s--;
        System.out.println(s);
        boolean o = 123 >= 234;
        System.out.println(o);

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
