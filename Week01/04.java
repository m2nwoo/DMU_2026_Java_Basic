package Week01;
import java.util.Random;

public class random2 {
    static void main(String[] args) {
        Random r = new Random();
        int a =  r.nextInt(6);
        int b = r.nextInt(6);
        a = a+1;
        a = b+1;
        int d = a + b;
        System.out.println("첫번째 주사위 값은" + a +"입니다.");
        System.out.println("두번째 주사위 값은" + b +"입니다.");
        System.out.println("주사위 합은 " + d +"입니다.");
    }
}
