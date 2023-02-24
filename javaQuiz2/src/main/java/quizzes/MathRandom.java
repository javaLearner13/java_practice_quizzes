package quizzes;

import java.security.SecureRandom;
import java.util.Random;
//Random보다는 SecureRandom을 사용하자 (보안)
public class MathRandom {
    public static void main(String[] args) {
        //1부터 6사이의 임의의 수를 Math.random()을 이용해서 value에 저장
        // 0.0 <= Math.random() < 1.0

        int value = (int)Math.random()*6 + 1;
        System.out.println("Math.random() version: "+value);
        Random rand = new Random();
        value = rand.nextInt(6)+1;
        System.out.println("rand version: "+value);

        //SecureRandom을 사용하자
        SecureRandom srand = new SecureRandom();
        value = srand.nextInt(6)+1;
        System.out.println("srand version: "+value);
    }
}
