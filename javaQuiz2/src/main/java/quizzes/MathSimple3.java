package quizzes;

public class MathSimple3 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        while(true){
            count++;
            sum = (count%2==0)? (sum -= count):(sum += count);
            if(sum>=100) break;
        }
        System.out.println(count);
    }
}
