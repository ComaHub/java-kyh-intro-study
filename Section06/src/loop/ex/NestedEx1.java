package loop.ex;

public class NestedEx1 {
  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.print((i * j) + " ");
      }
      System.out.println();
    }
  }
}
