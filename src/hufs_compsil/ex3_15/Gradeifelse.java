package hufs_compsil.ex3_15;

import java.util.Scanner;

public class Gradeifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //콘솔에 입력할 수 있는 Scanner객체를 생성
        System.out.print("성적 입력: ");
        int point = input.nextInt();            //값을 입력받아 point변수에 저장. nextInt()는 입력 데이터를 정수 변환해서 반환하는 메서드.
        char grade;

        if (90 <= point)
            grade = 'A';
        else if (80 <= point)
            grade = 'B';
        else if (70 <= point)
            grade = 'C';
        else
            grade = 'F';
        System.out.println("학점: " + grade);
        input.close();
    }
}
