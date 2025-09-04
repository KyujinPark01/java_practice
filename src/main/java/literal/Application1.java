package literal;

public class Application1 {
    public static void main(String[] args) {
//        level01-basic
        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */
        int a = 20;
        int b = 30;

        System.out.println("더하기 결과 : " + (a + b));
        System.out.println("빼기 결과 : " + (a - b));
        System.out.println("곱하기 결과 : " + a * b);
        System.out.println("나누기한 몫 : " + a / b);
        System.out.println("나누기한 나머지 : " + a % b);

//        level02-normal
        /* 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */
        char c = 'a';
        System.out.println((int) c);
    }

}
