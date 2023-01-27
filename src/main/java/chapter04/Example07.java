package chapter04;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        // while 문과 Scanner를 이용하여
        // 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.print("선택 > ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("예금액 > ");
                int deposit = sc.nextInt();
                balance += deposit;
            } else if (num == 2) {
                System.out.print("출금액 > ");
                int withdraw = sc.nextInt();
                balance -= withdraw;
            } else if (num == 3) {
                System.out.println("잔고 > "+balance);
            } else if (num == 4) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력 입니다.");
            }

        }
    }
}
