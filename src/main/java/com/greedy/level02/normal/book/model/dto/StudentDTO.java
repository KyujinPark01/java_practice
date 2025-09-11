package com.greedy.level02.normal.book.model.dto;

public class StudentDTO {
    int grade;
    int classroom;
    String name;
    int kor;
    int eng;
    int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getInformation() {
        int avg = (kor + eng + math) / 3;

        return "학년=" + grade + ",반=" + classroom + ",이름=" + name +
                ",국어=" + kor + ",영어=" + eng + ",수학=" + math + ",평균=" + avg;
    }
}