package chapter04;

public class ContinueExample {
    public static void main(String[] args) {
        // 1~10 사이의 수 중에서 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
