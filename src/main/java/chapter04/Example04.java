package chapter04;

public class Example04 {
    public static void main(String[] args) {
        // while 문과 Math.random() 메소드를 이용하여
        // 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)
        // 눈의 합이 5가 아니면 계속 던지고 눈의 합이 5이면 종료
        boolean result = true;

        while (result) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            if (sum != 5){
                System.out.println("dice1 : " + dice1 + "\ndice2 : " + dice2);
                System.out.println("주사위 합은 " + sum);
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            } else {
                System.out.println("dice1 : " + dice1 + "\ndice2 : " + dice2);
                System.out.println("주사위 합은 " + sum);
                System.out.println("프로그램 종료");
                result = false;
            }
        }
    }
}
