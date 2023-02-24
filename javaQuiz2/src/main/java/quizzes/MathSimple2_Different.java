package quizzes;

public class MathSimple2_Different {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            totalSum += sum;
        }
        System.out.println("totalum= "+totalSum);
    }
}
