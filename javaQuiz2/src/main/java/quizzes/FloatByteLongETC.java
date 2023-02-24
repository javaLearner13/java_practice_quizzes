package quizzes;

public class FloatByteLongETC {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);

        char ch = 'A';
//        ch += 2;
        ch = (char) (ch + 2);

//        float f = (float)3 / 2;
        float f = 3 / 2f;
//        long l = (long) 3000 * 3000 * 3000;
        long l = 3000 * 3000 * 3000L;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float) d == f2;

        System.out.println("c= " + c);
        System.out.println("ch= " + ch);
        System.out.println("f= " + f);
        System.out.println("l= " + l);
        System.out.println("result= " + result);
    }
}
