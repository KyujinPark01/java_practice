package literal;

public class Application2 {

    public static void main(String[] args) {

        /* 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */
        double width = 12.5F;
        double height= 36.4F;


        System.out.println("면적 : " +(width * height));
        System.out.println("둘레 : " + 2*(width + height));

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        float koreaScore = 80.5F;
        float mathScore = 50.6F;
        float EnglishScore = 70.8F;

        System.out.println("총점 : " + (int)(koreaScore+mathScore+EnglishScore));
        System.out.println("총점 : " + (int)((koreaScore+mathScore+EnglishScore)/3));


    }
}

