package test_01;

public class test_01 {
    public static void main(String[] args) {

        // 실습문제 1

        int num1 = 20;
        int num2 = 30;

        System.out.println("더하기 결과 : " + (num1 + num2));
        System.out.println("빼기 결과 : " + (num1 - num2));
        System.out.println("곱하기 결과 : " + (num1 * num2));
        System.out.println("나누기 한 몫 결과 : " + num1 / num2);
        System.out.println("나누기한 나머지 결과 : " + (num1 % num2));

        // 실습문제 2

        double wh = 12.5;
        double ht = 36.4;

        System.out.println("면적 : " + (wh * ht));
        System.out.println("둘레 : " + (wh * 2 + ht * 2));
    }
}
