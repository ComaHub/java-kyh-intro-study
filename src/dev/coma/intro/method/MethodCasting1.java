package dev.coma.intro.method;

public class MethodCasting1 {
  public static void main(String[] args) {
    double number = 1.5;
    //printNumber(number);
    printNumber((int) number);
  }

  public static void printNumber(int n) {
    System.out.println("숫자: " + n);
  }
}
