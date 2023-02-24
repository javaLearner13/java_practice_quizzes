package quizzes;

public class MathSimple5 {
    public static void main(String[] args) {
        //2x+4y=10의 모든 해를 구하시오 (0<=x<=10, y도 마찬가지, 모두 정수)
        for(int i=0;i<=10;i++){
            for(int j=0;j<=10;j++){
                if(2*i+4*j==10){
                    System.out.println("x="+i+", y="+j);
                }
            }
        }
    }
}
