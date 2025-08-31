package dev.coma.intro.method.ex;

public class MethodEx2 {
  public static void main(String[] args) {
    String message = "Hello, world!";

    repeat(message, 3);
    repeat(message, 5);
    repeat(message, 7);
  }

  public static void repeat(String message, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(message);
    }
  }
}
