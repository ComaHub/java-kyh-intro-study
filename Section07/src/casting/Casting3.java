package casting;

public class Casting3 {
  public static void main(String[] args) {
    long maxIntValue = 2147483647; // int Max 값
    long maxIntOver = 2147483648L; // int Max 값 + 1
    int intValue = 0;

    intValue = (int) maxIntValue;
    System.out.println("maxIntValue Casting = " + intValue);

    intValue = (int) maxIntOver; // Overflow
    System.out.println("maxIntOver Casting = " + intValue);
  }
}
