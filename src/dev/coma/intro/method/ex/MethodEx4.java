package dev.coma.intro.method.ex;

import java.util.Scanner;

public class MethodEx4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int balance = 0;

    while (true) {
      System.out.println("------------------------------------------");
      System.out.println("1: 입금 | 2: 출금 | 3: 잔액 확인 | 4: 종료");
      System.out.println("------------------------------------------");
      System.out.print("선택: ");
      int selectedMenu = scanner.nextInt();
      scanner.nextLine(); //\n 버리기

      if (selectedMenu == 1) {
        System.out.print("입금액을 입력하세요: ");
        int deposit = scanner.nextInt();
        balance = deposit(balance, deposit);
      } else if (selectedMenu == 2) {
        System.out.print("출금액을 입력하세요: ");
        int withdraw = scanner.nextInt();
        balance = withdraw(balance, withdraw);
      } else if (selectedMenu == 3) {
        myBalance(balance);
      } else if (selectedMenu == 4) {
        System.out.println("시스템을 종료합니다.");
        break;
      } else {
        System.out.println("올바른 메뉴를 선택해주세요.");
      }
    }
  }

  public static int deposit(int balance, int deposit) {
    balance += deposit;
    System.out.println(deposit + "원을 입금하였습니다. 현재 잔액: " + balance);
    return balance;
  }

  public static int withdraw(int balance, int withdraw) {
    if (balance >= withdraw) {
      balance -= withdraw;
      System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance);
    } else {
      System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
    }

    return balance;
  }

  public static void myBalance(int balance) {
    System.out.println("현재 잔액: " + balance);
  }
}
