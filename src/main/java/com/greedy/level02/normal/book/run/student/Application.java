package com.greedy.level02.normal.book.run.student;

import com.greedy.level02.normal.book.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        StudentDTO[] studentDTOS = new StudentDTO[10];
        int count =0;
        while(true){
            System.out.print("학년 :");
            int grade = sc.nextInt();
            System.out.print("반 :");
            int classroom = sc.nextInt();
            System.out.print("이름 :");
            String name = sc.next();
            System.out.print("국어점수 :");
            int kor = sc.nextInt();
            System.out.print("영어점수 :");
            int eng = sc.nextInt();
            System.out.print("수학점수 :");
            int math = sc.nextInt();
            studentDTOS[count] = new StudentDTO(grade,classroom,name,kor,eng,math);
            count++;
            System.out.print("계속 추가할 겁니까?(y/n)");
            String line = sc.next();
            sc.nextLine();
            if(line.equals("n")){
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(studentDTOS[i].getInformation());
        }




    }
}
