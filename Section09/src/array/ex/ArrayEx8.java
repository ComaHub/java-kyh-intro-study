package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("학생 수를 입력하세요: ");
    int student = scanner.nextInt();
    int[][] grades = new int[student][3];
    String[] subjects = {"국어", "영어", "수학"};

    for (int i = 0; i < grades.length; i++) {
      System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
      for (int j = 0; j < 3; j++) {
        System.out.print(subjects[j] + " 점수: ");
        grades[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < grades.length; i++) {
      int total = 0;
      for (int j : grades[i]) {
        total += j;
      }

      double average = (double) total / 3;

      System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
    }
  }
}
