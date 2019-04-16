package day02;

public class TestUtils {
    public static void main(String[] args) {
        int a = 5;
//        a = (a++) - (a--);
        int b = a++;
        int c = a--;
        a = b - c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}