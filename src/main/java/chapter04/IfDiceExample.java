package chapter04;

public class IfDiceExample {
    public static void main(String[] args) {

        // Math.random() 메소드는 0.0 <= ~ <1.0 사이의 double 타입 난수 리턴
        // 각 변에 6을 곱하면
        // (0.0 * 6) <= (Math.random()*6) < (1.0 * 6)
        // int 타입으로 강제 타입 변환하면
        // 0, 1, 2, 3, 4, 5 중에서 하나의 정수 난수를 얻게 된다
        // 각 변에 1을 더하면 1~6 중에서 하나의 정수 난수를 얻게 된다.

        int num = (int)(Math.random()*6) +1;

        if (num == 1) {
            System.out.println("숫자 1");
        } else if(num == 2) {
            System.out.println("숫자 2");
        } else if(num == 3) {
            System.out.println("숫자 3");
        } else if(num == 4) {
            System.out.println("숫자 4");
        } else if(num == 5) {
            System.out.println("숫자 5");
        } else {
            System.out.println("숫자 6");
        }

    }
}
