package Week01;
import java.util.Random;

public class ramdom {
    static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(6);
        a = a + 1;
        System.out.println("주사위 던짐: " + a + "이 나왔음");
    }
}
