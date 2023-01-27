package chapter04;

public class Example05 {
    public static void main(String[] args) {
        // 중첩 for문 이용 4x + 5y =  60의 해를 모두 구해서
        // (x, y)형태로 출력
        // x와 y는 10이하의 자연수
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((4 * i) + (5 * j) == 60) {
                    System.out.println("("+i+", "+j+")");
                }
            }
        }
    }
}
