package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] productNames = new String[10];
    int[] productPrices = new int[10];
    int productCount = 0;

    while (true) {
      System.out.println("1: 상품 등록 | 2: 상품 목록 | 3: 종료");
      System.out.print("메뉴를 선택하세요: ");
      int selectedMenu = scanner.nextInt();
      scanner.nextLine(); //\n 버리기

      if (selectedMenu == 1) {
        if (productCount >= 10) {
          System.out.println("상품은 최대 10개까지 등록할 수 있습니다.");
        } else {
          System.out.print("상품 이름을 입력하세요: ");
          productNames[productCount] = scanner.nextLine();

          System.out.print("상품 가격을 입력하세요: ");
          productPrices[productCount] = scanner.nextInt();

          productCount++;
        }
      } else if (selectedMenu == 2) {
        if (productCount == 0) {
          System.out.println("등록된 상품이 없습니다.");
        } else {
          for (int i = 0; i < productCount; i++) {
            System.out.println(productNames[i] + ": " + productPrices[i] + "원");
          }
        }
      } else if (selectedMenu == 3) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("올바른 메뉴를 선택해주세요.");
      }
    }
  }
}
