package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("첫 번째 수를 입력하세요: ");
    int a = scanner.nextInt();

    System.out.print("두 번째 수를 입력하세요: ");
    int b = scanner.nextInt();

    int temp;
    temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
