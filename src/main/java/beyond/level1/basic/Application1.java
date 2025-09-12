package beyond.level1.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String answer;
        System.out.print("문자열 입력 : ");
        String line = sc.nextLine();
        int count = 0;
        String[] split = line.split(" ");
        for (String s : split) {
            answer = "";
            for (int j = 0; j < s.length(); j++) {
                if (j == 0) {
                    answer += s.toUpperCase().charAt(0);
                } else {
                    answer += s.toLowerCase().charAt(j);

                }
            }
            answer += " ";
            sb.append(answer);
            count++;
        }
        System.out.println("변환된 문자열 : " + sb);
        System.out.println("가장 빈도 높은 단어: "+count);
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

    }
}
