package quizzes;

public class MathSimple2 {
    public static void main(String[] args) {
        //1+(1+2)+(1+2+3)+...+(1+2+3+...+9+10)
        int d;
        int sum = 0;
        for(int i=1;i<=10;i++){
            d=i;
            while(d>0){
                sum+=d;
                d--;
            }
        }
        System.out.println(sum);
    }
}
