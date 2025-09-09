package array.level4.advanced;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        Arrays.fill(arr, Integer.MIN_VALUE);
        int count = 0;
        int num = 0;
        int c = 10;
        String answer = "";
        boolean flag = false;
        while (arr[3] == Integer.MIN_VALUE) {
            count = (int) (Math.random() * 9 + 0);
            for (int i : arr) {
                if (i != count) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[num] = count;
                num++;
            }
        } // 중복없는 난수 구현
        for (int i = 0; i < 4; i++) {
            answer += arr[i];
        }
        System.out.println(answer);

        while (c > 0) {
            int strike = 0, ball = 0;
            System.out.println(c + "회 남으셨습니다.");
            System.out.println("4자리 숫자를 입력하세요 : ");
            String n = sc.next();
            if (n.length() < 4) {
                System.out.println("4자리 숫자를 입력해야합니다.");
                n = sc.next();
            }
            c--;
            if (answer.equals(n)) {
                System.out.println("정답입니다.");
                break;
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (answer.charAt(i) == n.charAt(j) && i == j) {
                        strike++;
                    } else if (answer.charAt(i) == n.charAt(j)) {
                        ball++;
                    }
                }
            }
            System.out.println("아쉽네요. " + strike + "s " + ball + "b" + " 입니다.");
            if (c == 0) {
                System.out.println("10번의 기회를 모두 소진하였습니다. 프로그램을 종료합니다.");
            }
        }


    }

}
