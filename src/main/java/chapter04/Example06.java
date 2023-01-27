package chapter04;

public class Example06 {
    public static void main(String[] args) {
        // for문을 이용해서 다음을 출력
//        *
//        **
//        ***
//        ****
//        *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
