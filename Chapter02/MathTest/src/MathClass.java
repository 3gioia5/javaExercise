import java.lang.Math;
import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        // Math 클래스 사용
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(8));
//        System.out.println(Math.min(4, 10));
//        System.out.println(Math.max(4, 10));

        // Random 클래스 사용
        Random rand = new Random();
//        System.out.println(rand.nextInt(10));
        int min = 10;
        int max = 30;
        System.out.println(rand.nextInt((max - min) + 1 + min));
    }
}
